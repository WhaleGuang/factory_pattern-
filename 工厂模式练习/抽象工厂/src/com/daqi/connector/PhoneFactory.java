package com.daqi.connector;

/**
 * 为Phone工厂，创建一个接口
 */
public interface PhoneFactory {
    Phone createPhone();//创建手机
    Usb createUSB();//给手机安装一个USB的充电接口
    Charger createCharger();//给手机一个可以充电的地方
}
