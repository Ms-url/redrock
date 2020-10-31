package cn.red.game;

import java.util.Random;
import java.util.Scanner;

public class Game_1_0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //初始化
        System.out.println("选择角色：");
        System.out.println("1.刺客   2.游侠  3.骑士");
        int he= sc.nextInt();
        Hero_1 hero1= new Hero_1(he);

        System.out.println("你好，" + Hero_1.getNAME() + "，欢迎你的到来");
        System.out.println("-----------------");
        System.out.println(hero1);
        System.out.println("-----------------");

        int i =1;
        for (; ; ) {
            Random ra = new Random();
            int level = ra.nextInt(4);
            Monstar_1 monstar1 = new Monstar_1();
            monstar1.level(level);
            System.out.println(monstar1);
            System.out.println("-------------------");
            monstar1.Show2(level);

            System.out.print("第"+i+"战-----------------");
            Fight fight1 = new Fight();
            fight1.Fighting();

            System.out.println(hero1);
            System.out.println("是否继续战斗？（y/n)");
            String answer = sc.next();
            String n = "n";
            if(Hero_1.getHP()<=0){
                System.out.println("你已经失败");
                break;
            }
             else if (answer.equals(n)) {
                break;
            }
             i++;
        }
    }
}





