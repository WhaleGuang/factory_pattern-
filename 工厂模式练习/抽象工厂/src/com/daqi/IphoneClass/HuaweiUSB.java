package com.daqi.IphoneClass;

import com.daqi.connector.Usb;

public class HuaweiUSB implements Usb {

    @Override
    public void usbcable() {
        System.out.println("华为手机的USB数据接头。。");
    }
}
