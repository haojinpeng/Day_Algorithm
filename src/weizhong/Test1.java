package weizhong;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入数组长度和查询次数");
        Scanner sc = new Scanner(System.in);
        //数组长度
        int len = sc.nextInt();
        //查询次数
        int count = sc.nextInt();
        //创建一个长度为len的数组
        int[] nums = new int[len];
        System.out.println("请输入数组内容");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        //将数组排序
        Arrays.sort(nums);
        //进行比较
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            func(nums,len,num);
        }
    }
    public static void func(int[] nums,int len,int num){
        //排除特殊情况。如果输入的数大于最大值，那么返回最大值。
        //如果输入的数小于最小值，那么返回最小值
        if (num >= nums[len-1]){
            System.out.println(nums[len-1]);
            return;
        }else if (num <= nums[0]){
            System.out.println(nums[0]);
            return;
        }

        /*这个是Integer类中的一个int类型的常量MAX_VALUE
        它代表int所能表示的最大值 0x7FFFFFFF*/
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (num == nums[i]){
                System.out.println(num);
                return;
            }else if (num < nums[i]){
                //Math.abs() 返回参数的绝对值。
                int temp = Math.abs(num-nums[i-1]);
                res = Math.min(res,temp);
                System.out.println(res);
                return;
            }
        }
    }
}
