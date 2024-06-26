package day3;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        System.out.print("请输入0-50的数字：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("你输入的数字是："+a);
        Random r = new Random();
        int b = r.nextInt(51);
        int flag=1;
        while (flag==1){
            if(a==b){
                System.out.println("你猜对了");
                flag=0;
            }else if(a<b){
                System.out.print("你猜小了，请再次输入：");
                a=sc.nextInt();
            }else {
                System.out.print("你猜大了，请再次输入：");
                a=sc.nextInt();
            }
        }

    }
}
