package com.daqi;

import com.daqi.connector.PhoneFactory;
import com.daqi.plant.HuaweiFactory;
import com.daqi.plant.IphoneFactory;
import com.daqi.plant.LenovoFactory;

public class Main {
    public static void main(String[] args) {
        //苹果手机调用
        PhoneFactory pg = new IphoneFactory();
        pg.createPhone().play();

        //华为手机调用
        PhoneFactory hw = new HuaweiFactory();
        hw.createPhone().play();

        //联想手机调用
        PhoneFactory lx = new LenovoFactory();
        lx.createPhone().play();
    }
}
