package com.daqi;

import com.daqi.connector.PhoneFactory;
import com.daqi.plant.HuaweiPhoneFactory;

public class Main {
    public static void main(String[] args) {
        //华为手机调用
        PhoneFactory hw = new HuaweiPhoneFactory();
        hw.createPhone().play();
        hw.createUSB().usbcable();
        hw.createCharger().recharge();
    }
}
