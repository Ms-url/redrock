package cn.red.demo;

import java.util.Random;
import java.util.Scanner;

public class Lv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请为对称矩阵输入行数：");
        int row = sc.nextInt();
        int[][] matrix1 = Matrix(row);
        int[][] matrix2 = Matrix(row);

        System.out.println("随机对称矩阵A：");
        Rmatr(row, matrix1);
        System.out.println("随机对称矩阵B：");
        Rmatr(row, matrix2);
        System.out.println("相乘后的对称矩阵：");


        int[][] matrix3 = new int[row][row];
        for(int i=0; i<row;i++){
            for(int h=0; h<row;h++){
                for(int k=0;k<row;k++){
                    matrix3[i][h]+=matrix1[i][k]*matrix2[k][h];
                }
            }
        }

        Rmatr(row, matrix3);
        System.out.println("对角线之和：");
        int total=0;
        for (int i=0;i<row;i++){
            total=total+matrix3[i][i];
        }
            System.out.println(total);

    }

    //打印方法
    public static void Rmatr(int row, int[][] matrix) {
        for (int i = 0; i < row; i++) {
            for (int g = 0; g < row; g++) {
                System.out.print(matrix[i][g] + " ");
            }
            System.out.println(" ");
        }
    }
    //随机生成nxn矩阵
    public static int[][] Matrix(int row) {
        int[][] matrix1 = new int[row][row];

        for (int a = 0; a < matrix1.length; a++) {
            for (int b = 0; b < matrix1[a].length; b++) {

                Random ra = new Random();
                int i = ra.nextInt(10);
                matrix1[a][b] = i;
            }
        }
        return matrix1;
    }
}
       /* int[][] matrix1 = new int[row][row];

      for (int a = 0; a < matrix1.length; a++) {
            for (int b = 0; b < matrix1[a].length; b++) {

                Random ra = new Random();
                int i = ra.nextInt(10);
                matrix1[a][b] = i;
            }
        }
        int[][] matrix2 = new int[row][row];

        for (int a = 0; a < matrix2.length; a++) {
            for (int b = 0; b < matrix2[a].length; b++) {

                Random ra = new Random();
                int i = ra.nextInt(10);
                matrix2[a][b] = i;
            }
        }*/

      /*  int h = 0;
        for (int x = 0; x < row ; x++) {
            for (int i = 0; i < row; i++) {
                int total = 0;
                for (int g = 0; g < row; g++) {
                    int mun = matrix1[i][g] * matrix2[g][i];
                    total = total + mun;
                }do {
                    matrix3[x][h] = total;
                    h++;
                    continue;
                } while (h > row);
            }
        }*/       //无效算法
