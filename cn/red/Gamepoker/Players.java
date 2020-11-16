package cn.red.Gamepoker;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Players implements Lookpoker{
    private String name;
    private int money;
    private List<Integer>cards;

    public Players(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //看牌
    @Override
    public String rLookpoker(List<Integer> nums, Map<Integer, String> pokers) {
        Collections.sort(nums);//升序排列

        StringBuilder sb=new StringBuilder();
        for(Integer num:nums){
            String poker=pokers.get(num);
            sb.append(poker+" ");
        }

        String st=sb.toString();
        return  st.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<Integer> getCards() {
        return cards;
    }

    public void setCards(List<Integer> cards) {
        this.cards = cards;
    }
}
