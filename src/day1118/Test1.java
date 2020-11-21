package day1118;
/*给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
你可以假设数组中无重复元素。*/
public class Test1 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 4;
        int res = searchInsert(nums, target);
        System.out.println(res);
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }
}
