package cn.red.demo;

import javax.swing.*;
import java.util.Scanner;

public class Lv3_1_0 {
    /*
     String n=JOptionPane.showInputDialog(" ");
        int number;
        number =Integer.parseInt(n);

        JOptionPane.showMessageDialog(null,"hello world!");
        System.exit(0);
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant re = new Restaurant();
        Menu me = new Menu();//创建对象

        String dish = "";
        int money = 0;

        String n = JOptionPane.showInputDialog("国民饭店欢迎你，这是今日菜单：\n" +
                "编号     菜名            价格\n" +
                "----------------------------------\n" +
                " 1.     辣子鸡丁         38元  \n" +
                " 2.     水煮肉片         22元  \n" +
                " 3.     糖醋里脊         18元  \n" +
                " 4.     干锅牛肉         38元  \n" +
                " 5.     干锅排骨         29元  \n" +
                "请输入想要点的菜的序号：");
        int i = Integer.parseInt(n);
        Menu me1 = new Menu(i);
        dish = dish + me1.getMenuName() + "    " + me1.getMenuMoney() + "元" + "\n";
        money = money + me1.getMenuMoney();

        for (int h=0; h<4;h++ ) {
            String n1 = JOptionPane.showInputDialog("继续点餐\n" +
                    "编号     菜名            价格\n" +
                    "----------------------------------\n" +
                    " 1.     辣子鸡丁         38元  \n" +
                    " 2.     水煮肉片         22元  \n" +
                    " 3.     糖醋里脊         18元  \n" +
                    " 4.     干锅牛肉         38元  \n" +
                    " 5.     干锅排骨         29元  \n" +
                    "---------------------------------" + "\n" +
                    "目前你共选择了：\n" + dish + "共计" +
                    money + "元" + "\n" +
                    "请输入想要点的菜的序号：");
            int v = Integer.parseInt(n1);
            Menu me2 = new Menu(v);
            dish = dish + me2.getMenuName() + "    " + me2.getMenuMoney() + "元" + "\n";
            money = money + me2.getMenuMoney();
           // String n2 = JOptionPane.showInputDialog("是否要继续点餐？y/no");
           // Byte no = Byte.parseByte(n2);

           // if (no.equals(no)) {
              //  break; }
        }
        String n3 = JOptionPane.showInputDialog( "目前你共选择了：\n" + dish + "共计" +
                money + "元" + "\n" +"请选择支付方式：\n" +
                "1.支付宝支付\n" +
                "2.微信支付\n" +
                "3.刷脸支付\n" +
                "请输入编号：");
        int pay = Integer.parseInt(n3);
        switch (pay) {
            case 1:
                JOptionPane.showMessageDialog(null, "请出示付款码....");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "请出示付款码....");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "请正对人脸识别系统");
                break;
        }
        //   JOptionPane.showMessageDialog(null, dish);
           System.exit(0);
    }
}



