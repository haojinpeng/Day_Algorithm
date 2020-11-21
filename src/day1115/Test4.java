package day1115;


import java.util.Scanner;

/*正整数分解质因数
   题目描述:
   将一个正整数分解质因数。例如，输入90打印出90-23*3*5，
   程序分析:对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完
   成:
   (1)如果这个质数恰好等于n，则说明分解质因数的过程已经结束，打印出即可。
   (2)如果n>k,但n能被k整除，则应打印出k的值，并用n除以的商作为新的正整
   数你n重复执行第一步。
   (3)如果n不能被k整除，则用k+1作为k的值重复执行第一步。*/
public class Test4 {
    //n代表需要输入的正整数
    static int n,k = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n = sc.nextInt();
        System.out.print(n + "=");
        Fenjie(n);
    }
    //分解函数
    private static void Fenjie(int n) {
        while (n >= k){
            if (n == k){
                System.out.print(n);
                break;
            }else if (n > k && n % k == 0){
                System.out.print(k + "*");
                n = n/k;
                Fenjie(n);
                break;
            }else if (n > k && n % k != 0){
                k++;
                Fenjie(n);
                break;
            }
        }
    }
}
