package day3.GrabRedEnvelopes;

import java.util.ArrayList;
import java.util.Random;

public class Member extends People{

    boolean flag=false;

    public Member(String number, int i) {
        super(number, i);
    }

    @Override
    public void set_balance(int money) {
        this.balance += money;
    }
    public int grab(ArrayList<Integer> list){
        Random rand = new Random();
        int random = rand.nextInt(list.size());
        set_balance(list.get(random));
        System.out.println("抢到："+list.get(random));
        return random;
    }
}
