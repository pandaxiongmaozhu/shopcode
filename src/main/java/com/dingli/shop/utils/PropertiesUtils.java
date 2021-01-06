package com.dingli.shop.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
    public static String getUrlValue(String urlName, String properName) {
        String url = null;
        Properties prop = new Properties();
        try {
            InputStream in = PropertiesUtils.class.getClassLoader().getResourceAsStream(properName + ".properties");
            prop.load(in); /// 加载属性列表
            url = prop.getProperty(urlName);
            in.close();
        } catch (Exception e) {

        }
        return url;
    }
}
