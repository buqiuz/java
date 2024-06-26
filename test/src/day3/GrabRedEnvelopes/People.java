package day3.GrabRedEnvelopes;

public abstract class People {
    public Integer balance;
    public String name;

    public People() {}
    public People(String _name,Integer _balance) {
        this.name=_name;
        this.balance=_balance;
    }

    public abstract void set_balance(int money);
    public void showBalance(){
        System.out.println(this.name+":"+this.balance);
    }
}
