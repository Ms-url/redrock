package cn.red.demo;

public class Menu_2 {
    public Menu_2() {}

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

    public void MenuList(){
        System.out.println(getMenuMunble()+"        "+getMenuName()+"        "+getMenuMoney());
    }

    public void Selet(String dish,int money) {
        System.out.println("-------------------------------");
        System.out.println("目前你共选择了：");
        System.out.println(dish);
        System.out.println("共计"+money+"元");
        System.out.println("-------------------------------");
    }
}
