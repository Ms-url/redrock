package cn.red.love;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;
/**
 * 综合对象 小V小V
 * 1、小工具类对象 小V
 * 2、简易计算器（由小V实现）
 * 3、反射demo（获取小V的属性）
 * 4、泛型集合
 * 5、底层链表
 */

public class 小V小V {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        小V xiaoV = new 小V();

        Calendar tim = Calendar.getInstance();
        int time = tim.get(Calendar.HOUR_OF_DAY);
        int minute = tim.get(Calendar.MINUTE);
        System.out.println("现在是" + time + "点" + minute + "分");
        if (time >= 6 && time < 9) {
            System.out.println("早上好，美好的一天从见到小V开始~~~");
        } else if (time >= 9 && time < 12) {
            System.out.println("上午好，今天是元气满满的一天！");
        } else if (time >= 12 && time < 18) {
            System.out.println("下午好~~~");
        } else if (time >= 18 && time < 24) {
            System.out.println("晚上好~~~~");
        } else {
            System.out.println("小v提示您：熬夜对身体不好哦");
        }

        System.out.println("小V竭诚为你服务：");
        for (;;) {
            System.out.println("1.行列式计算  2.简易计算器  3.矩阵计算");

            int i = sc.nextInt();

            switch (i) {
                case 1:
                    xiaoV.DeterminantCalculate();
                    break;
                case 2:
                    xiaoV.simpleCalculation();
                    break;
                case 3:
                    Matrix matrix = new Calculation();
                    System.out.println("开发者比较懒，还没有为小V写矩阵运算");
                    break;
                case 4:


            }
       }
    }
}
