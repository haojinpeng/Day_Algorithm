package weizhong;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入数组长度n
        int n = sc.nextInt();
        //定义数组，长度为n
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        //判断是否为三元组
        int count = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (nums[i]<=nums[j] && nums[j]<=nums[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
