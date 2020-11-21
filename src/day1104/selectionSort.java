package day1104;

import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        System.out.println("请输入数组长度");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        //定义一个长度为length的数组
        int[] arr = new int[length];
        System.out.println("请输入数组内容");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        selectSort(arr);
    }
    public static void selectSort(int[] arr){
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]){
                    // 记录最小值的下标
                    minIndex = j;
                }
            }
            // 将最小元素交换至首位
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
