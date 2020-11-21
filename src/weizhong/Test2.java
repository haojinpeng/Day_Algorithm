package weizhong;

import java.util.Scanner;

/*
题目：
    现在你在玩一款游戏，叫做节奏大师。它有三种判定：
        P : Perfect完美，加200分。
        G : Great很棒，加100分。
        M : Miss错过，不加分也不扣分，但累计三次Miss就会输掉游戏。
    另外有一种奖励是连击奖励。一旦连续三个Perfect之后，后续连击的Perfect分数将变成250分，
    但一旦打出了Great或者Miss则连击数将重新开始计算。
    你的任务是根据游戏记录计算分数。特别地，失败记为零分。

    输入描述：
        一行一个字符串，描述你的游戏记录。
        保证字符串长度小于等于10000
    输出描述：
        一行一个正整数表示得分

   样例输入：
        PPPPPGPPMP
   样例输出：
        1800
*/
public class Test2 {
    public static void main(String[] args) {
        //输入字符串
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            int index = 0;  //字符的下标
            int length = s.length(); //输入字符的长度
            long score = 0;  //记录分数
            int prefect = 1;//记录连续为prefect的次数
            int miss = 0;//记录miss

            for (int i = 0; i < length; i++) {
                //如果miss大于3，结束游戏
                if (miss >= 3){
                    System.out.println("lose");
                    return;
                    //如果为P，且次数小于3，分数加200
                }else if (s.charAt(index) == 'P' && prefect <= 3){
                    score += 200;
                    index++;
                    //如果有连续两次为P，那么prefect次数加1
                    if (index > 0 && s.charAt(index - 1) == 'P'){
                        prefect++;
                    }
                    //如果三次以上为P，分数加250
                }else if (s.charAt(index) == 'P' && prefect > 3){
                    score += 250;
                    index++;
                    //如果为G，分数加100，prefect置1
                }else if (s.charAt(index) == 'G'){
                    score += 100;
                    prefect = 1;
                    index++;
                    //如果为Miss，prefect置1,miss加1
                }else {
                    index++;
                    miss++;
                    prefect = 1;
                }
            }
            System.out.println(score);
        }
    }
}
