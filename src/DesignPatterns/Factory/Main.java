package DesignPatterns.Factory;

/**
 * Created by YGZ on 2016/7/26.
 * My email : gzyang1125@foxmail.com
 */
public class Main {
    public static void main(String[] args) {
        /*Hair left = new LeftHair();
        left.draw();*/

        /*Hair hair = new HairFactory().getHair("right");
        hair.draw();*/

        PersonFactory factory = new HNFactory();
        Boy boy = factory.getBoy();
        boy.draw();
    }
}
