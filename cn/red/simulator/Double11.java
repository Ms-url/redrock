package cn.red.simulator;

public class Double11 {
    public static void main(String[] args) {
        Consumer xiaoxiaozhi=new Xiaoxiaozhi("小小智");
        Store jindong=new Store();
        Goods phone=new Goods("手机");

        xiaoxiaozhi.Buy(jindong,phone);

        jindong.sellgoodsto(xiaoxiaozhi);

        jindong.sendgoodsto(xiaoxiaozhi);

       // xiaoxiaozhi.Getgoods(phone);
    }
}
