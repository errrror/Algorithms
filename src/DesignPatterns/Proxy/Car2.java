package DesignPatterns.Proxy;

/**
 * Created by YGZ on 2016/8/24.
 * My email : gzyang1125@foxmail.com
 */
public class Car2 extends Car {
    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶....");
        super.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶....  汽车行驶时间："
                + (endtime - starttime) + "毫秒！");
    }
}
