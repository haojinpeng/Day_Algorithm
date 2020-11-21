package day1120;
/*
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
*/
public class Test1 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("最大和为："+maxSubArray(arr));
    }
    public static int maxSubArray(int[] arr){
        int max = arr[0];  //最大和
        int dp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (dp <= 0){
                dp = arr[i];
            }else {
                dp = dp + arr[i];
            }
            max = Math.max(max,dp);
        }
        return max;
    }
}
