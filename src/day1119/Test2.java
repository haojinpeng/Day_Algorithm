package day1119;


public class Test2 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for (int i:arr) {
            System.out.print(i+",");
        }
    }
    public static int[] moveZeroes(int[] arr){
        if (arr == null){
            return null;
        }
        //两个指针i和j
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            //注意j要++，不然先前的值就会被覆盖
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
        return arr;
    }
}
