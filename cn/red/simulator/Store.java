package cn.red.simulator;

public class Store implements SellGoods{
    private static String name="京东";
    private Consumer consumer;

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public void sellgoodsto(Consumer consumer) {
        System.out.println(name+"收到了"+consumer.getName()+"的订单");
    }

    @Override
    public void sendgoodsto(Consumer consumer) {
        Goods goodsforconsumer=new Goods("手机");
        System.out.println(name+"寄出了包裹");
        consumer.Getgoods(goodsforconsumer);

    }
}
