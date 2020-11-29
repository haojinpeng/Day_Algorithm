package day1127;

import java.util.Stack;
/*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

        有效字符串需满足：
        左括号必须用相同类型的右括号闭合。
        左括号必须以正确的顺序闭合。
        注意空字符串可被认为是有效字符串。*/
public class leetcode20 {
    public static void main(String[] args) {
        String s = "(){}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        //1.特别情况
        if(s.isEmpty()) return true;
        //2.创建辅助栈
        Stack<Character> stack = new Stack<>();
        //3.遍历
        for(char c : s.toCharArray()){
            if(c == '('){
                //如果有则向辅助栈中添加右括号，栈中为")"
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }
        //4.返回
        return stack.isEmpty();
    }
}
