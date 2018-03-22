package com.cspm.oos.util;

import org.apache.commons.net.util.Base64;

import java.io.UnsupportedEncodingException;

/**
 * Base64处理工具类
 * @author CHENQUAN
 * @date 2018年1月19日
 */
public class Base64Util {
    /**
     * Base64加密
     *
     * @param date 待加密数据
     * @return 加密后数据
     * @author CHENQUAN
     * @date 2018年1月19日
     */
    public static String getBase64(String date) {
        String base64Str = null;
        try {
            base64Str = Base64.encodeBase64String(date.getBytes("utf-8")).replaceAll("\r\n","");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return base64Str;
    }

    /**
     * Base64解密
     *
     * @param base64Str 待解密数据
     * @return 解密后数据
     * @author CHENQUAN
     * @date 2018年1月19日
     */
    public static String getFromBase64(String base64Str) {
        String result = null;
        if (base64Str != null) {
            try {
                result = new String(Base64.decodeBase64(base64Str), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
