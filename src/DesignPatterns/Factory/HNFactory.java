package DesignPatterns.Factory;

/**
 * Created by YGZ on 2016/7/26.
 * My email : gzyang1125@foxmail.com
 */
public class HNFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new HNBoy();
    }

    @Override
    public Girl getGirl() {
        return new HNGirl();
    }
}
