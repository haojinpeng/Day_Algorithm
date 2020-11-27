package day1126;
/*给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
        找出那个只出现了一次的元素。*/
/*任何数和 00 做异或运算，结果仍然是原来的数，即 a \oplus 0=aa⊕0=a。
任何数和其自身做异或运算，结果是 00，即 a \oplus a=0a⊕a=0。*/

public class Leetcode136_1 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,3};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums){
        int single = 0;
        for (int num:nums) {
            single = single ^ num;
        }
        return single;
    }
}
