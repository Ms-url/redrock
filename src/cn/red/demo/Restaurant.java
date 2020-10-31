package cn.red.demo;

import java.util.Scanner;

public class Restaurant {
    //无参构造
    public Restaurant() {}

    Scanner sc = new Scanner(System.in);
    private String RestaurantName;

    public void setRestaurantName(String restaurantName) {
        this.RestaurantName=restaurantName;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void Wellcome() {
        System.out.println(" ");
        System.out.println("欢迎来到"+getRestaurantName()+",这是今日菜单:");
    }

    public void Pay() {
        System.out.println("请选择支付方式：");
        System.out.println("1.支付宝支付");
        System.out.println("2.微信支付");
        System.out.println("3.刷脸支付");
        System.out.println("请输入编号：");
    }
    public void Again(int h){
        switch (h){
            case 1:
                System.out.println("请出示付款码....");break;
            case 2:
                System.out.println("请出示付款码....");break;
            case 3:
                System.out.println("请正对人脸识别系统");break;
        }
        System.out.println(" ");
    }
}
