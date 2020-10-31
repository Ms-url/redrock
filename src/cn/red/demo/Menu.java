package cn.red.demo;

import java.util.Scanner;

public class Menu {
    private int MenuMunble;
    private String MenuName;
    private int MenuMoney;

    public void setMenuMunble(int munble) {
        this.MenuMunble = munble;
    }

    public int getMenuMunble() {
        return MenuMunble;
    }

    public void setMenuName(String name) {
        this.MenuName = name;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuMoney(int money) {
        this.MenuMoney = money;
    }

    public int getMenuMoney() {
        return MenuMoney;
    }

    public Menu() {
    }

    //含参构造，初始化属性
    public Menu(int munble) {
        this.setMenuMunble(munble);
        switch (getMenuMunble()) {
            case 1:
                this.setMenuName("辣子鸡丁");
                this.setMenuMoney(38);
                break;
            case 2:
                this.setMenuName("水煮肉片");
                this.setMenuMoney(22);
                break;
            case 3:
                this.setMenuName("糖醋里脊");
                this.setMenuMoney(18);
                break;
            case 4:
                this.setMenuName("干锅牛肉");
                this.setMenuMoney(38);
                break;
            case 5:
                this.setMenuName("干锅排骨");
                this.setMenuMoney(29);
                break;
            case 6:
                System.out.println("无此编号");
                break;
        }

    }

    public void View() {
        System.out.println(
                "编号     菜名            价格\n" +
                        "----------------------------------\n" +
                        " 1.     辣子鸡丁         38元  \n" +
                        " 2.     水煮肉片         22元  \n" +
                        " 3.     糖醋里脊         18元  \n" +
                        " 4.     干锅牛肉         38元  \n" +
                        " 5.     干锅排骨         29元  \n" +
                        "请输入想要点的菜的序号：");
    }

    public void Selet(String dish,int money) {
        System.out.println("-------------------------------");
        System.out.println("目前你共选择了：");
        System.out.println(dish);
        System.out.println("共计"+money+"元");
        System.out.println("-------------------------------");
    }
}

