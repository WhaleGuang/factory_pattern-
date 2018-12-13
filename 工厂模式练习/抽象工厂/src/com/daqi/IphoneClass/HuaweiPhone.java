package com.daqi.IphoneClass;

import com.daqi.connector.Phone;

/**
 * 华为手机类
 */
public class HuaweiPhone implements Phone {
    @Override
    public void play() {
        System.out.println("华为手机照亮你的美~~~");
    }
}
