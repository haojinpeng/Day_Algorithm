package day1110;

import java.util.HashMap;
/*
* 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
* 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.*/
public class Test1 {
    public static void main(String[] args) {
        Integer integer = first("implim");
        System.out.println(integer);
    }
    public static int first(String str){
        //定义一个Map集合，键为字符型，存输入的字符，值为int型，存字符出现的次数
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            //String类 charAt() 方法用于返回指定索引处的字符。
            //通过遍历下标，将字符串存入变量character中
            Character character = str.charAt(i);
            //集合类中的 Map.get() 方法返回指定键所映射的值。
            //如果此映射不包含该键的映射关系，则返回 null。
            Integer integer = map.get(character);
            //如果值不为null，说明以前出现过，+1进行区分
            //如果值为null，说明没出现过，将1存入，用于后面进行判断
            if (integer != null){
                map.put(character,integer+1);
            }else {
                map.put(character,1);
            }
        }
        //为了找出第一个出现次数为1的字符，遍历原字符串
        //第一个次数为1的字符，为要找的值
        for(int i=0; i<str.length() ; i++) {
            Character character = str.charAt(i);
            if(map.get(character)==1)
                return i;
        }
        return -1;
    }
}
