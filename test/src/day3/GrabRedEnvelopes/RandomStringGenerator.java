package day3.GrabRedEnvelopes;

import java.util.Random;

public class RandomStringGenerator {

    // 定义字符范围
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // 生成一个长度为10的随机字符串
        String randomString = generateRandomString(10);
        System.out.println("Random String: " + randomString);
    }
}
