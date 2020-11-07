package cn.red.game;
import java.util.*;

public class Gamepoker {
    public static void main(String[] args) {
        //定义一个双列集合，键表牌号，值表牌
        Map<Integer,String> pokers=new HashMap<>();
        //定义一个单列集合，存储牌号
        List<Integer>list=new ArrayList<>();
        //买牌
        String[]colors={"♠","♥","♣","♦"};
        String[]numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int num=0;
        //增强for循环
        for(String number:numbers){
            for(String color:colors){
                //拼接
                String poker=color+number;
                //牌号，牌加入双列集合
                pokers.put(num,poker);
                //牌号加入单列集合
                list.add(num);
                //牌号自增
                num++;
            }
        }
        pokers.put(num,"大王");
        list.add(num++);
        pokers.put(num,"小王");
        list.add(num);
        
        System.out.println("所有的牌："+pokers);
        System.out.println("所有的编号："+list);
        
        //洗牌
        Collections.shuffle(list);
        System.out.println("洗好后编号："+list);
        
        List<Integer>person1=new ArrayList<>();
        List<Integer>person2=new ArrayList<>();
        List<Integer>person3=new ArrayList<>();
        List<Integer>person4=new ArrayList<>();
        
        for (int i = 0; i<list.size(); i++){
            Integer pokernum=list.get(i);
            if(i>=list.size()-3){
                person4.add(pokernum);
            }else if (i%3==0) {
                person1.add(pokernum);
            }else if (i%3==1){
                person2.add(pokernum);
            }else if (i%3==2){
                person3.add(pokernum);
            }
        }

        System.out.println("按enter开始发牌...");
        Scanner sc=new Scanner(System.in);

        //接收回车
        sc.nextLine();

        System.out.println("person1"+Look(person1,pokers));
        System.out.println("person2"+Look(person2,pokers));
        System.out.println("person3"+Look(person3,pokers));
        System.out.println("person4"+Look(person4,pokers));

    }

    public static String Look(List<Integer>nums,Map<Integer,String>pokers){
        Collections.sort(nums);//升序排列

        StringBuilder sb=new StringBuilder();
        for(Integer num:nums){
            String poker=pokers.get(num);
            sb.append(poker+" ");
        }

        String st=sb.toString();
        return  st.trim();

    }
}
