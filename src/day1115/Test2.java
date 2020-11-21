package day1115;

import java.util.Scanner;

/*已知个产品上市后，项目团队参与项目的利润分成。当项目利润低于或等于10万元时，奖金可提5%;
利润高于10万元，低于20万元时,低于10万元的部分按5%提成高于10万元的部分，可提成4%;
20万到40万之间时，低于20万元的部分沿用上面的公式分成，高于20万元的部分，可提成5%;
40万到60万之间时，低于40万元的部分沿用上面的公式分成，高于40万元的部分，可提成3%;
60万到100万之 间时低于60万元的部分沿用上面的公式分成，高于60万元的部分,可提成1.5%;
高于100万元时低于100万元的部分沿用上面的公式分成，超过100万元的部分按1%提成;
请编程实现应发放奖金的算法，输入总利润后，输出应分成利润*/
public class Test2 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总利润");
        double money = sc.nextDouble();
        double suode = 0;
        if (money <= 10) {
            suode = money * 0.05;
        }else if(money > 10 && money < 20){
            suode = money * 0.1 + (money - 10) * 0.04;
        }else if (money > 20 && money < 40){
            suode = (money - 20) * 0.05 + 10 * 0.05 + 10 ;
        }
    }*/
}
