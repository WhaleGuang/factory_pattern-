package com.daqi.plant;

import com.daqi.IphoneClass.HuaweiCharger;
import com.daqi.IphoneClass.HuaweiPhone;
import com.daqi.IphoneClass.HuaweiUSB;
import com.daqi.connector.Charger;
import com.daqi.connector.Phone;
import com.daqi.connector.PhoneFactory;
import com.daqi.connector.Usb;

public class HuaweiPhoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Usb createUSB() {
        return new HuaweiUSB();
    }

    @Override
    public Charger createCharger() {
        return new HuaweiCharger();
    }
}
