package cn.red.calculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入(数字和运算符间用空格隔开)：");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            String[] st = input.split(" ");//用字符串数组来接受输入的多个数据。("")里的东西作为输入多个变量的分隔符
            double i = Double.parseDouble(st[0]);
            String h = st[1];
            double b = Double.parseDouble(st[2]);

            System.out.print(input + " = ");

            Calculate calculating = new Usecalculation();

            double answer = calculating.calculate(i, h, b);
            System.out.println(answer);

        } catch (Exception e) {
            System.out.println("非法输入");
            return;
        } finally {
            System.out.println("运行结束请重启");
        }


    }
}
