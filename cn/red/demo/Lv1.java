package cn.red.demo;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {15, 25, 10, 30, 40, 20, 50};

        System.out.println("冒泡排序的结果为：");
        Arrange(arr1);
        Show(arr1);

        System.out.println("请输入一个待插入的数：");
        int mun = sc.nextInt();
        int[] arr2 = {mun};

        System.out.println("插入" + mun + "之后数组为：");
        Merge(arr1, arr2);

    }

    //定义遍历数组方法
    public static void Show(int arr[]) {
        for (int h = 0; h < arr.length; h++) {
            System.out.print(arr[h] + " ");
        }
        System.out.println(" ");
    }

    //定义冒泡排序的方法
    public static void Arrange(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int g = 0; g < arr.length - 1 - i; g++) {
                if (arr[g] > arr[g + 1]) {
                    int a = arr[g];
                    arr[g] = arr[g + 1];
                    arr[g + 1] = a;
                }
            }
        }
    }

    //定义 合并数组 排序 遍历
    public static void Merge(int arr1[], int arr2[]) {
        int[] arr3 = new int[arr1.length + arr2.length];
        arr3[arr1.length + arr2.length - 1] = arr2[0];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        Arrange(arr3);
        Show(arr3);
    }

}



