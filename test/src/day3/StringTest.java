package day3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(Objects.equals(str1, str2));
    }
}
