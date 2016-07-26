package DesignPatterns.Singleton;

/**
 * Created by YGZ on 2016/7/26.
 * My email : gzyang1125@foxmail.com
 */

/*
饿汉模式：比较饥饿，直接创建，这样可以保证线程安全*/
public class Singleton2 {

    private static Singleton2 instance = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return instance;
    }
}
