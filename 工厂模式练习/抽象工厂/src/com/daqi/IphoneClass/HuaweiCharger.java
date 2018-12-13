package com.daqi.IphoneClass;

import com.daqi.connector.Charger;

public class HuaweiCharger implements Charger {
    @Override
    public void recharge() {
        System.out.println("来自华为手机的充电头！！");
    }
}
