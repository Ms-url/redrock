package cn.red.demo;

import java.util.Scanner;

public class Lv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant re = new Restaurant();
        Menu me = new Menu();//创建对象

        re.setRestaurantName("国民饭店");
        String dish = "";
        int money = 0;

        re.Wellcome();
        //死循环
        for (; ; ) {
            //展示 接收
            me.View();
            int i = sc.nextInt();
            Menu me2 = new Menu(i);
            //统计
            dish = dish + me2.getMenuName() + "    " + me2.getMenuMoney() +"元"+ "\n";
            money = money + me2.getMenuMoney();
            //打印目前定单
            me2.Selet(dish, money);
            //退出询问
            System.out.println("是否要继续点餐？（yes/no）");
            String no = "no";
            String answer = sc.next();
            if (answer.equals(no)) {
                break;
            }
        }
        //支付
        re.Pay();
        int h = sc.nextInt();
        re.Again(h);

    }
}
