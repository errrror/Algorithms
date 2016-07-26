package DesignPatterns.Singleton;

/**
 * Created by YGZ on 2016/7/26.
 * My email : gzyang1125@foxmail.com
 */
public class Main {
    public static void main(String[] args) {
        Singleton1 singleton11 = Singleton1.getInstance();
        Singleton1 singleton12 = Singleton1.getInstance();
        if (singleton11==singleton12){
            System.out.println("11 is the same to 12");
        }else{
            System.out.println("11 is not the same to 12");
        }

        Singleton2 singleton21 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();
        if (singleton21==singleton22){
            System.out.println("21 is the same to 22");
        }else{
            System.out.println("21 is not the same to 22");
        }
    }
}
