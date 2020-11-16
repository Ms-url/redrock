package cn.red.Gamepoker;

import java.util.*;

public class Automatic implements Shuffle, Dealcards {

    @Override
    public void rShuffle(Poker poker) {
        Collections.shuffle(poker.getList());
    }

    @Override
    public void rDealcards(List<Integer> list, Player player1, Player player2, Player player3, You you) {
        List<Integer> person1 = new ArrayList<>();
        List<Integer> person2 = new ArrayList<>();
        List<Integer> person3 = new ArrayList<>();
        List<Integer> person4 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer pokernum = list.get(i);
            if (i >= list.size() - 3) {
                person4.add(pokernum);
            } else if (i % 3 == 0) {
                person1.add(pokernum);
            } else if (i % 3 == 1) {
                person2.add(pokernum);
            } else if (i % 3 == 2) {
                person3.add(pokernum);
            }
        }
        player1.setCards(person1);
        player2.setCards(person2);
        you.setCards(person3);
        player3.setCards(person4);
    }

}
