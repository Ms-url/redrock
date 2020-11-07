package cn.red.simulator;

public class Consumer implements Consuming{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void Buy(Store store,Goods goods) {

        System.out.println(name+"在"+store.getName()+"买了"+goods.getName());
    }

    @Override
    public void Getgoods(Goods goods) {
        System.out.println(this.name+"拿到了"+goods.getName());
    }
}
