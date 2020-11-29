package day1128;
/*给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，
判断二者是否相等，并返回结果。 # 代表退格字符。
注意：如果对空文本输入退格字符，文本继续为空。*/
public class Leetcode844_1 {
    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        System.out.println(backspaceCompare(S,T));
    }
    public static boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }
    public static String build(String str){
        StringBuffer res = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            //如果不为#，那么就将字符添加到字符串中
            //如果为#，那么就删除当前字符串中最后一个字符
            if (ch != '#'){
                res.append(ch);
            }else {
                if (res.length() > 0){
                    res.deleteCharAt(res.length() - 1);
                }
            }
        }
        return res.toString();
    }
}
