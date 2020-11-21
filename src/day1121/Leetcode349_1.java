package day1121;

import java.util.HashSet;
import java.util.Set;

//给定两个数组，编写一个函数来计算它们的交集。
public class Leetcode349_1 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = intersection(nums1, nums2);
        for (int result:res) {
            System.out.print(result+",");
        }
    }
    //一、使用Set集合
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> parentSet = new HashSet<>();
        Set<Integer> childSet = new HashSet<>();
        for (int num:nums1) {
            parentSet.add(num);
        }
        for (int num:nums2) {
            //如果第一个数组存在此元素，则将此元素添加给第二个数组
            //即第二个数组存放的就是重合的数组元素
            if (parentSet.contains(num)){
                childSet.add(num);
            }
        }
        int[] resArr = new int[childSet.size()];
        int index = 0;
        for (int value:childSet) {
            resArr[index++] = value;
        }
        return resArr;
    }
}
