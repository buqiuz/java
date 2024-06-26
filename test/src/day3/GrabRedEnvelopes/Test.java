package day3.GrabRedEnvelopes;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        ArrayList<Member> memberList=new ArrayList<>();
        String name=RandomStringGenerator.generateRandomString(3);
        Random random=new Random();
        int balance=random.nextInt(10000);
        Manager manager = new Manager(name,balance);

        for(int i=0;i<10;i++){
            name=RandomStringGenerator.generateRandomString(3);
            balance=random.nextInt(100);
            Member member =new Member(name,balance);
            memberList.add(member);
        }

        System.out.print("群主");
        manager.showBalance();

        int money=random.nextInt(10000);
        int count=random.nextInt(10);
        ArrayList<Integer>list= manager.send(money,count);
        if (!list.isEmpty()) {
            System.out.println("发送红包："+money+"    "+"数量："+count);
        }
        System.out.print("群主");
        manager.showBalance();
        System.out.println();
        System.out.println(list);

        int size=list.size();
        for(int i=0;i<size;i++){
            int randomNumber=random.nextInt(memberList.size());
            while (memberList.get(randomNumber).flag){
                randomNumber=random.nextInt(memberList.size());
            }
            System.out.print("抢到前：");
            memberList.get(randomNumber).showBalance();
            int index=memberList.get(randomNumber).grab(list);
            memberList.get(randomNumber).flag=true;
            list.remove(index);
            System.out.print("抢到后：");
            memberList.get(randomNumber).showBalance();
        }

    }
}
