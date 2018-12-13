package com.daqi;

import com.daqi.IphoneClass.Huawei;
import com.daqi.IphoneClass.Iphone;
import com.daqi.IphoneClass.Lenovo;
import com.daqi.connector.Phone;
import com.daqi.connector.PhoneFactory;

public class Main {
    public static void main(String[] args) {
        PhoneFactory pf = new PhoneFactory();

        pf.createPhone("lx").play();
        pf.createPhone("pg").play();
        pf.createPhone("hw").play();

    }
}
