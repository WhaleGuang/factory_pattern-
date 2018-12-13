package com.daqi.IphoneClass;

import com.daqi.connector.Phone;

/**
 * 联想手机类
 */
public class Lenovo implements Phone {
    @Override
    public void play() {
        System.out.println("联想手机，连着你和我...");
    }
}
