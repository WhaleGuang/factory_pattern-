package com.daqi.plant;

import com.daqi.IphoneClass.Huawei;
import com.daqi.connector.Phone;
import com.daqi.connector.PhoneFactory;

public class HuaweiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Huawei();
    }
}
