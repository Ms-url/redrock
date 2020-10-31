package cn.red.game;

public class Equipment {
    private static String equip1="急救包";
    private static String equip2="屠龙宝刀";
    private static String equip3="角盾";
    private static String equip4="魔力手套";

    private static String equip5="魔偶";

    public static String getEquip1() {
        return equip1;
    }

    public static void setEquip1(String equip1) {
        Equipment.equip1 = equip1;
    }

    public static String getEquip2() {
        return equip2;
    }

    public static void setEquip2(String equip2) {
        Equipment.equip2 = equip2;
    }

    public static String getEquip3() {
        return equip3;
    }

    public static void setEquip3(String equip3) {
        Equipment.equip3 = equip3;
    }

    public static String getEquip4() {
        return equip4;
    }

    public static void setEquip4(String equip4) {
        Equipment.equip4 = equip4;
    }

    public static String getEquip5() {
        return equip5;
    }

    public static void setEquip5(String equip5) {
        Equipment.equip5 = equip5;
    }

    public void GetEquip(int i){
        switch (i+1){
            case 1:
        System.out.println("         获得"+Equipment.getEquip1());
        Hero_1.setHP(Hero_1.getHP()+100);break;
            case 2:
        System.out.println("         获得"+Equipment.getEquip2());
        Hero_1.setATTACH(Hero_1.getATTACH()+10);break;
            case 3:
        System.out.println("         获得"+Equipment.getEquip3());
        Hero_1.setDEFENSE(Hero_1.getDEFENSE()+2);break;
            case 4:
        System.out.println("         获得"+Equipment.getEquip4());
        Hero_1.setBLOW(Hero_1.getBLOW()+1);break;
            case 5:
        System.out.println("获得"+Equipment.getEquip5());
        }
    }
}
