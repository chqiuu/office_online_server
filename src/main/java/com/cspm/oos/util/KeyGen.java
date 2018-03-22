package com.cspm.oos.util;

import org.apache.commons.net.util.Base64;
import org.thymeleaf.util.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Created by CHQIU on 2017-09-13.
 */
public class KeyGen {

    private byte[] key;
    private int saltLength = 8;

    public KeyGen() {
        super();
    }

    public KeyGen(String value, String saltStr) {

    }

    /**
     * 利用java原生的摘要实现SHA256加密
     *
     * @param str 加密后的报文
     * @return
     */
    public static String getSHA256StrJava(String str) {
        MessageDigest messageDigest;
        String encodeStr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            encodeStr = byte2Hex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encodeStr;
    }

    /**
     * 将byte转为16进制
     *
     * @param bytes
     * @return
     */
    private static String byte2Hex(byte[] bytes) {
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for (int i = 0; i < bytes.length; i++) {
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length() == 1) {
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }

    public String getHash(String message) {
        //强加密
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[saltLength];
        secureRandom.nextBytes(salt);
        String secretStr = Base64.encodeBase64String(salt);
        return getHash(message, secretStr);

    }

    /**
     * 加密
     *
     * @param message
     * @param secretStr
     * @return
     */
    private String getHash(String message, String secretStr) {
        try {
            Mac hmac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(secretStr.getBytes(), "HmacSHA256");
            hmac.init(secret_key);
            String hash = Base64.encodeBase64String(hmac.doFinal(message.getBytes()));
            return hash;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 验证TOKEN是否有效
     *
     * @param name        文件名称
     * @param accessToken 授权码
     * @return 验证是否有效
     */
    public boolean validate(String name, String accessToken) {
        if (StringUtils.isEmpty(accessToken)) {
            return false;
        } else {
            String targetHash = getHash(name, accessToken.substring(0, saltLength + 4));
            return accessToken.equals(targetHash);
        }

/*
        var targetHash = GetHash(name, access_token.Substring(0,_saltLength + 4));  //hack for base64 form
        Console.Write(targetHash);
        return String.Equals(access_token, targetHash);
        */
    }
}
