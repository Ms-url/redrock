package cn.red.love;

import java.util.Scanner;

public class DeterminantDeal extends Calculation implements Determinant {

    @Override
    public void Showfinallyanswer(double[][] determinant) {
        double result = 1;
        try {
            result = result * MathDeterminantCalculation(determinant);
            System.out.println("行列式的答案为：" + result);
        }catch (Exception e){
            System.out.println("什么地方出错了，再试一次吧");
        }
    }

    @Override
    public void DeterminantGet() {
        System.out.println("请输入行列式：（元素之间以空格为间隔）");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        try {
        String str = sc.nextLine();
            String[] strs = str.split(" ");
            int longth = strs.length;
            double[][] determinant = new double[longth][longth];
            for (int g = 0; g <= longth - 1; g++) {
                determinant[i][g] = Double.parseDouble(strs[g]);
            }

            i++;
            for (; ; ) {
                if (i >= longth) {
                    break;
                }
                String st = sc.nextLine();
                String[] sts = st.split(" ");
                for (int g = 0; g <= longth - 1; g++) {
                    determinant[i][g] = Double.parseDouble(sts[g]);
                }
                i++;
            }
        DeterminantPaste(determinant, longth);
        } catch (Exception e) {
            System.out.println("小V提示：这不是正确的行列式形式哦");
            System.out.println("正确示例：\n" +
                    "1 2 3 4\n" +
                    "5 6 7 8\n" +
                    "9 0 9 8\n" +
                    "7 6 5 6");
        }
    }

    @Override
    public void DeterminantPaste(double[][] determinant, double longth) {
        int[][] determ = new int[(int) longth][(int) longth];
        for (int m = 0; m < longth; m++) {
            for (int k = 0; k < longth; k++) {
                determ[m][k] = (int) determinant[m][k];
                System.out.print(determ[m][k] + " ");
                // if (m>=longth/2-1 && k==longth){
                //    System.out.print("=");
                //   Showfinallyanswer(determinant);
            }
            System.out.println(" ");
        }
        Showfinallyanswer(determinant);
    }
    // }

    @Override
    public double MathDeterminantCalculation(double[][] value) throws Exception {
        if (value.length == 1) {
            return value[0][0];
        } else if (value.length == 2) {
            return value[0][0] * value[1][1] - value[0][1] * value[1][0];
        }

        double result = 1;
        for (int i = 0; i < value.length; i++) {
            //检查数组对角线位置的数值是否是0，如果是零则对该数组进行调换，查找到一行不为0的进行调换
            if (value[i][i] == 0) {
                value = ChangeDeterminantNoZero(value, i, i);
                result *= -1;
            }
            for (int j = 0; j < i; j++) {
                //让开始处理的行的首位为0处理为三角形式
                if (value[i][j] == 0) {
                    continue;
                }
                //如果要是要处理的行是0则和上面的一行进行调换
                if (value[j][j] == 0) {
                    double[] temp = value[i];
                    value[i] = value[i - 1];
                    value[i - 1] = temp;
                    result *= -1;
                    continue;
                }
                double ratio = -(value[i][j] / value[j][j]);
                value[i] = AddValue(value[i], value[j], ratio);
            }
        }
        return MathValue(value, result);
    }

    @Override
    // 计算行列式的结果
    public double MathValue(double[][] value, double result) throws Exception {
        for (int i = 0; i < value.length; i++) {
            if (value[i][i] == 0) {
                return 0;
            }
            result *= value[i][i];
        }
        return result;
    }

    @Override
    public double[] AddValue(double[] currentRow, double[] frontRow, double ratio) throws Exception {
        for (int i = 0; i < currentRow.length; i++) {
            currentRow[i] += frontRow[i] * ratio;
        }
        return currentRow;
    }

    @Override
    public double[][] ChangeDeterminantNoZero(double[][] determinant, int line, int row) throws Exception {
        for (int j = line; j < determinant.length; j++) {
            //进行行调换
            if (determinant[j][row] != 0) {
                double[] temp = determinant[line];
                determinant[line] = determinant[j];
                determinant[j] = temp;
                return determinant;
            }
        }
        return determinant;
    }
}
