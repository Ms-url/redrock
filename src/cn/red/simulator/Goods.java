package cn.red.simulator;

public class Goods {
    private String name;
    private int price;

    public Goods(String name) {
        this.name = name;
       // this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
