package cn.red.calculation;

import java.util.Scanner;

 import java.util.*;
public class king {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入任意数据(注意输入数据的个数必须大于等于需要转化的个数)：");
            String str = sc.nextLine();
            String[] strs = str.split(" ");//用字符串数组来接受输入的多个数据。("")里的东西作为输入多个变量的分隔符，此处我设为空格
            int a = Integer.parseInt(strs[0]);//将String字符串型数据转化成想要的类型即可。此处输入时要输入整型，转化才不会出现错误或误差
            double b = Double.parseDouble(strs[1]);//此处输入时要输入double型，转化才不会出现错误或误差
            System.out.println(a);//输出值测试一下
            System.out.println(b);
        }

    }



