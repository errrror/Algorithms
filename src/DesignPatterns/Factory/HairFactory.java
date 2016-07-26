package DesignPatterns.Factory;

/**
 * Created by YGZ on 2016/7/26.
 * My email : gzyang1125@foxmail.com
 */
public class HairFactory {
    public Hair getHair(String key){
        Hair hair = null;
        if("left".equals(key)){
            hair = new LeftHair();
        }else if ("right".equals(key)){
            hair = new RightHair();
        }
        return hair;
    }
}
