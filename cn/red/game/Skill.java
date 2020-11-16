package cn.red.game;

public class Skill {
    String []skill={"突刺","飓风","沉默"};

    public String toString() {
        return 1+skill[0]+"   "+2+skill[1]+"    "+3+skill[2];
    }
    public void Skilling(int i){
        System.out.print(Hero_1.getNAME()+"使用"+skill[i-1]);
    }

    public void Using(int bit,int sk){
        switch (sk){
            case 1:
        Fight.hartforHero = (int) (Hero_1.getATTACH() + Math.pow(1, bit) * Hero_1.getATTACH() * bit / 10 - Monstar_1.getDefense1());break;
            case 2:
        Fight.hartforHero =  Hero_1.getATTACH() + Hero_1.getATTACH() * 2 / 10 - Monstar_1.getDefense1();break;
            case 3:
                Fight.hartforHero = (int) (Hero_1.getATTACH() + Math.pow(-1, bit) * Hero_1.getATTACH() * bit / 10 - Monstar_1.getDefense1());
        }

    }
}
