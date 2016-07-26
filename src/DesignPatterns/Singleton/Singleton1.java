package DesignPatterns.Singleton;

/**
 * Created by YGZ on 2016/7/26.
 * My email : gzyang1125@foxmail.com
 */

/*
懒汉模式：比较懒，延迟创建类，每次到用到的时候进行创建
线程不安全，若有两个线程同时创访问的时候可能会出现同时创建两个实例
解决方案：通过volatile和synchronized进行修饰*/
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (instance==null){
            instance = new Singleton1();
        }
        return instance;
    }

}
