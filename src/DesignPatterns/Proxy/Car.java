package DesignPatterns.Proxy;

import java.util.Random;

/**
 * Created by YGZ on 2016/8/24.
 * My email : gzyang1125@foxmail.com
 */
public class Car implements Moveable{
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中~~~~~~");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
