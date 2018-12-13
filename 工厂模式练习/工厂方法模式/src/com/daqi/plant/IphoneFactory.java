package com.daqi.plant;

import com.daqi.IphoneClass.Iphone;
import com.daqi.connector.Phone;
import com.daqi.connector.PhoneFactory;

public class IphoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}
