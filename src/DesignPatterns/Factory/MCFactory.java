package DesignPatterns.Factory;

/**
 * Created by YGZ on 2016/7/26.
 * My email : gzyang1125@foxmail.com
 */
public class MCFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }
}
