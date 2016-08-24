package DesignPatterns.Proxy;

/**
 * Created by YGZ on 2016/8/24.
 * My email : gzyang1125@foxmail.com
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        Moveable m = new Car3(car);
        m.move();
    }
}
