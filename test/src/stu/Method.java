package stu;


public class Method {
    public static int get_min(int[] nums){
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int get_max(int[] nums){
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void is_prime(int[] nums) {
        for (int num : nums) {
            if(num%2!=0){
                System.out.println(num);
            }
        }
    }
    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i ; j < nums.length-1; j++) {
                if(nums[j]<nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void prime_in_100() {
        System.out.print("1-100的质数有：");
        for (int i = 1; i < 100; i++) {
            int flag=1;
            for (int j = 2; j*j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void Fibonacci_Sequence_in_100(){
        System.out.print("Fibonacci Sequence in 100:");
        int a=1;
        int b=2;
        System.out.print(a+" "+b+" ");
        while((a+b)<100){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println();
    }
    public static void draw(int n) {
        char ch='*';
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static int str_repeat_time(String str,String s){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int flag=0;
            if(str.charAt(i)==s.charAt(0)){
                flag=1;
                for(int j=1;j<s.length();j++){
                    if (str.charAt(i + j) != s.charAt(j)) {
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag==1){
                count+=1;
            }
        }
        return count;
    }

}
