package cn.red.game;

public class Monstar_1 {
    private static String name1;
    private static int attach1;
    private static int defense1;
    private static int levelm;

    private static int HP = 0;

    int[] blood = {100, 120, 150, 240};
    int[] attach = {25, 35, 55, 66};
    int[] defense = {5, 15, 24, 35};
    String[] name = {"幽灵", "骷髅", "沙虫", "镜像"};

    public static String getName1() {
        return name1;
    }

    public static int getAttach1() {
        return attach1;
    }

    public static int getDefense1() {
        return defense1;
    }

    public static int getHP() {
        return HP;
    }


    public static void Hart(int i) {
        HP = HP - i;
    }

    public static int getLevelm() {
        return levelm;
    }

    public static void setLevelm(int levelm) {
        Monstar_1.levelm = levelm;
    }

    public static void setName1(String name1) {
        Monstar_1.name1 = name1;
    }

    public static void setAttach1(int attach1) {
        Monstar_1.attach1 = attach1;
    }

    public static void setDefense1(int defense1) {
        Monstar_1.defense1 = defense1;
    }

    public static void setHP(int HP) {
        Monstar_1.HP = HP;
    }

    public String toString() {
        return "遭遇战" + "----" + name1 + "----" + "等级" + levelm + "\n" + "生命值=" + HP + "  " + "攻击力=" + attach1 + "  " + "防御力=" + defense1;
    }


    public void level(int level) {
        name1 = name[level];
        attach1 = attach[level];
        defense1 = defense[level];
        HP =blood[level];
        levelm = level + 1;
    }

    public static void show() {
        System.out.println(name1 + "的生命值现为：" + HP);
        System.out.println("  ");
    }

    public static void Show2(int level) {
        switch (level+1) {
            case 1:
                System.out.println("  ******");
                System.out.println(" *       *");
                System.out.println("*  *   *  *");
                System.out.println("*         *");
                System.out.println("*         *");
                System.out.println("***********");break;
            case 2:
                System.out.println("  *********");
                System.out.println(" *         *");
                System.out.println("*  **   **  *");
                System.out.println("*           *");
                System.out.println(" *  *****  *  ");
                System.out.println("    *****");break;
            case 3:
                System.out.println("     ****");
                System.out.println("    *     *");
                System.out.println("    ****   *");
                System.out.println("        *   *");
                System.out.println("         *   *");
                System.out.println("         *    *");
                System.out.println("      *************");break;
            case 4:
                System.out.println("      *****");
                System.out.println("    * *****");
                System.out.println("     *  *");
                System.out.println("      * * *  *");
                System.out.println("        *  *");
                System.out.println("        *");
                System.out.println("       * *");
                System.out.println("      *   *");break;

        }
    }

}

