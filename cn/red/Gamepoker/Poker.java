package cn.red.Gamepoker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poker {
    private  Map<Integer, String> pokers;
    private  List<Integer> list;

    public Map<Integer, String> getPokers() {
        return pokers;
    }

    public void setPokers(Map<Integer, String> pokers) {
        this.pokers = pokers;
    }

    public List<Integer> getList() {
        return this.list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void getpoker(Poker poker){
        Map<Integer, String> pokers = new HashMap<>();
        //定义一个单列集合，存储牌号
        List<Integer> list = new ArrayList<>();
        //买牌
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int num = 0;
        //增强for循环
        for (String number : numbers) {
            for (String color : colors) {
                //拼接
                String wholepoker = color + number;
                //牌号，牌加入双列集合
                pokers.put(num, wholepoker);
                //牌号加入单列集合
                list.add(num);
                //牌号自增
                num++;
            }
        }
        pokers.put(num, "大王");
        list.add(num++);
        pokers.put(num, "小王");
        list.add(num);

        poker.setPokers(pokers);
        poker.setList(list);
    }


}

