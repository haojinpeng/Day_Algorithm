package day1115;

import java.util.Scanner;

//字符串排序，把字符串转换为char，进行冒泡排序
//如234rtyui，234irtuy
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要排序的字符串");
        String input = sc.nextLine();
        //字符串转换为字符数组
        char[] arr = input.toCharArray();
        Sort(arr);
        //将排序后的字符数组转换为字符串
        String output = null;
        output = output.valueOf(arr);
        System.out.println(output);
    }
    //实现冒泡排序
    public static void Sort(char[] arr){
        char temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
