package com.daqi.connector;

import com.daqi.IphoneClass.Huawei;
import com.daqi.IphoneClass.Iphone;
import com.daqi.IphoneClass.Lenovo;

/**
 * 新加的一层
 * 在客户端和接口之间加一层
 */
public class PhoneFactory {
    public static Phone createPhone(String tag) {
        if (tag.equals("lx")) {//联想
            return new Lenovo();
        } else if (tag.equals("pg")) {//苹果
            return new Iphone();
        } else if (tag.equals("hw")) {//华为
            return new Huawei();
        } else {
            return null;
        }
    }
}
