package cn.red.game;

public class Hero_1 {
    //静态变量
    private static String NAME;
    private static int ATTACH;
    private static int DEFENSE;
    private static int BLOW=0;
    private static int HP=0;
    public Hero_1(int i){
        HP=HP +hp[i-1];
        ATTACH=ATTACH+attach[i-1];
        DEFENSE=DEFENSE+defense[i-1];
        NAME=name[i-1];
        BLOW=BLOW+blow[i-1];
    }

    String []name={"刺客","游侠","骑士"};
    int []attach={88,76,65};
    int []defense={19,25,26};
    int []hp={170,200,260};
    int []blow={1,0,0};



    public static String getNAME() {
        return NAME;
    }

    public static int getATTACH() {
        return ATTACH;
    }

    public static int getDEFENSE() {
        return DEFENSE;
    }

    public static int getBLOW() {
        return BLOW;
    }

    public static int getHP() {
        return HP;
    }

    public static void setNAME(String NAME) {
        Hero_1.NAME = NAME;
    }

    public static void setATTACH(int ATTACH) {
        Hero_1.ATTACH = ATTACH;
    }

    public static void setDEFENSE(int DEFENSE) {
        Hero_1.DEFENSE = DEFENSE;
    }

    public static void setBLOW(int BLOW) {
        Hero_1.BLOW = BLOW;
    }

    public static void setHP(int HP) {
        Hero_1.HP = HP;
    }

    public String toString() {
       return "当前你的属性为:"+" \n "+"生命值="+HP+"  "+"攻击力="+ATTACH+"  "+"防御力="+DEFENSE;
    }

    public static void Hart(int i){
        HP=HP-i;
    }

    public static void show(){
        System.out.print("你的生命值现为："+HP+"    ");
    }

}
