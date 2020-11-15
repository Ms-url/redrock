package cn.red.love;

import cn.red.calculation.Usecalculation;

import java.util.Scanner;

public class Calculation implements  Matrix,SimpleCalculate {

    @Override
    public void PutOutCalcuateAnwser() {
        System.out.println("请输入(数字和运算符间用空格隔开)：");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            String[] st = input.split(" ");//用字符串数组来接受输入的多个数据。("")里的东西作为输入多个变量的分隔符
            double i = Double.parseDouble(st[0]);
            String h = st[1];
            double b = Double.parseDouble(st[2]);

            System.out.print(input + " = ");
            double answer = Calculate(i, h, b);
            System.out.println(answer);

        } catch (Exception e) {
            System.out.println("非法输入\n" +
                    "小V提示：开发者比较懒，只为小V写了两个数之间的四则运算");
            return;
        }
            System.out.println("计算结束");

    }

    @Override
    public double Calculate(double x, String operate, double y) {
        double answer =0;
        if("+".equals(operate)){
            answer=x+y;
        }else if ("-".equals(operate)){
            answer=x-y;
        }else if ("*".equals(operate)){
            answer=x*y;
        } else if ("/".equals(operate)){
            answer=x/y;
        }
        return answer;
    }


    @Override
    public void MatrixMultiplication() {

    }

    @Override
    public void InverseMatrix() {

    }



}