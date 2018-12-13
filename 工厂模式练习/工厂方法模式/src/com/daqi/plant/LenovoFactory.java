package com.daqi.plant;

import com.daqi.IphoneClass.Lenovo;
import com.daqi.connector.Phone;
import com.daqi.connector.PhoneFactory;

public class LenovoFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Lenovo();
    }
}
