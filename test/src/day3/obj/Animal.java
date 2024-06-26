package day3.obj;

public abstract class Animal {
    // 抽象方法
    public abstract void makeSound();

    // 具体方法
    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}
