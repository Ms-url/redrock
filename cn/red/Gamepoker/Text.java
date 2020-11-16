package cn.red.Gamepoker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Text {
    public static void main(String[] args) {
        Automatic automatic=new Automatic();
        Poker pokers=new Poker();
        Players xiaohei=new Player("小黑",100);
        Players caixukun=new Player("蔡虚坤",100);
        Players mabaoguo=new Player("马老师",100);
        Players you=new You("you",100);

     //   List<Integer>lis=new ArrayList<>();
     //   Map<Integer,String> poke=new HashMap<>();

        //
        pokers.getpoker(pokers);
        //
        automatic.rShuffle(pokers);
        //
       // automatic.rDealcards();
        System.out.println(pokers);
    }

}
