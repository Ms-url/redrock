package cn.red.game;

import java.util.Random;
import java.util.Scanner;

public class Fight {
    public Fight() {
    }

    Scanner sc = new Scanner(System.in);
    Skill skill = new Skill();

    static int hartforMonstar;
    static int hartforHero;

    public static int getHartforHero() {
        return hartforHero;
    }

    public static int getHartforMonstar() {
        return hartforMonstar;
    }

    public static void setHartforMonstar(int hartforMonstar) {
        Fight.hartforMonstar = hartforMonstar;
    }

    public static void setHartforHero(int hartforHero) {
        Fight.hartforHero = hartforHero;
    }

    public void Fighting() {
        Equipment e=new Equipment();

        for (int i = 1; i < 100; i++) {
            Random ra = new Random();
            int bit1 = ra.nextInt(2) + 1;
            Fight.hartforMonstar = (int) (Monstar_1.getAttach1() + Math.pow(-1, bit1) * Monstar_1.getAttach1() * bit1 / 10 - Hero_1.getDEFENSE());

            System.out.println("第" + i + "回合");
            System.out.println("请选择技能");
            System.out.println(skill);

            int sk = sc.nextInt();
            skill.Skilling(sk);
            int bit = ra.nextInt(2) + 1+Hero_1.getBLOW();
            skill.Using(bit,sk);

            System.out.print("攻击" + Monstar_1.getName1() + "造成" + Fight.hartforHero + "点伤害");
            Monstar_1.Hart(Fight.hartforHero);
            System.out.println(" ");
            if (Monstar_1.getHP() <= 0) {
                System.out.println("战斗胜利");
                System.out.println("-----win------win------win------win------win------");
                int equipment1=ra.nextInt(4);
                int equipment2=ra.nextInt(4);
                e.GetEquip(equipment1);
                e.GetEquip(equipment2);

                System.out.println(" ");
                break;
            }
            System.out.println(Monstar_1.getName1() + "攻击" + Hero_1.getNAME() + "造成" + Fight.hartforMonstar + "点伤害");
            Hero_1.Hart(Fight.hartforMonstar);
            Hero_1.show();
            Monstar_1.show();
            if (Hero_1.getHP() <= 0) {
                System.out.println("------战斗失败------");
                break;
            }
            System.out.print("-------------------------");
        }
    }
}
