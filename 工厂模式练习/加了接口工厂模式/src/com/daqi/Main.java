package com.daqi;

import com.daqi.IphoneClass.Huawei;
import com.daqi.IphoneClass.Iphone;
import com.daqi.IphoneClass.Lenovo;
import com.daqi.connector.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Iphone();
        phone1.play();

        Phone phone2 = new Lenovo();
        phone2.play();

        Phone phone3 = new Huawei();
        phone3.play();

    }
}
