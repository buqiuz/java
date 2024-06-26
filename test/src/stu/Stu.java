package stu;

public class Stu {
    public static void main(String[] args) {
        int[] nums = {1,10,3,4,8,6,7,8,9,6};
        int sum=0;
        for (int j : nums) {
            sum += j;
        }
        System.out.println(sum);
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println(min);
        System.out.println(max);
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i; j < nums.length-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("排序后：");
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("奇数：");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println("曹仕");

        int a= Method.get_min(nums);
        System.out.print("nums的最小值：");
        System.out.println(a);
        Method.prime_in_100();
        Method.Fibonacci_Sequence_in_100();
        Method.draw(10);
        int cnt=Method.str_repeat_time("acsdfsdcscsdcs","cs");
        System.out.println(cnt);


    }
}
