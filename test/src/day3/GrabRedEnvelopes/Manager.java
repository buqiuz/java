package day3.GrabRedEnvelopes;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends People{

    public Manager(String number, int i) {
        super(number, i);
    }

    @Override
    public void set_balance(int money) {
        this.balance -= money;
    }


    public ArrayList<Integer> send(int money, int count){
        ArrayList<Integer> list = new ArrayList<>();
        if(this.balance < money){
            System.out.println("余额不足，无法发送红包");
            return list;
        }else{
            set_balance(money);
            Random random = new Random();
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(0);
            temp.add(money);
            for(int i=1;i<count;i++){
                int number = random.nextInt(money)+1;
                temp.add(number);
            }
            temp.sort(Integer::compareTo);
            for (int i = 0; i < count; i++) {
                list.add(temp.get(i+1)-temp.get(i));
            }
        }
        return list;
    }
}
