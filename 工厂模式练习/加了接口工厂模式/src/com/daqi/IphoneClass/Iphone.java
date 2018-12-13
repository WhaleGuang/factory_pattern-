package com.daqi.IphoneClass;

import com.daqi.connector.Phone;

/**
 * 苹果手机类
 */
public class Iphone implements Phone {
    @Override
    public void play() {
        System.out.println("这个是高级的名牌手机--苹果。");
    }
}
