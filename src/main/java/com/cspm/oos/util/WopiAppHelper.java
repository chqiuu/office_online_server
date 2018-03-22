package com.cspm.oos.util;

import com.cspm.oos.enums.ActionEnum;
import com.cspm.oos.enums.WopiDiscoveryEnum;
import org.thymeleaf.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * OOS工具类
 * Created by CHQIU on 2017-09-13.
 */
public class WopiAppHelper {

    private static String wopiHostFormat = "%s?WOPISrc=%s&access_token=%s";
    private static String wopiHostFormatPdf = "%s?PdfMode=1&WOPISrc=%s&access_token=%s";

    public static void main(String[] args) throws Exception {
        //
        String fileName = "http://s0.sciencepeditor.com/resource/file/2017/12/15/20171215144937135WREV.docx";
        System.out.println(fileName.substring(fileName.indexOf("/resource/")));
        String wopiHostAndFile = "http://oos.sciencepeditor.com/bc/wopi/files/" + Base64Util.getBase64(fileName);
        String ext = "docx";
        String action = "view";
        System.out.println(Base64Util.getBase64(fileName));
        System.out.println(wopiHostAndFile);
        System.out.println(getDocumentLink(wopiHostAndFile, ext, action));
    }

    public static String getDocumentLink(String wopiHostAndFile, String ext, String action) throws Exception {
        String fileName = wopiHostAndFile.substring(wopiHostAndFile.lastIndexOf("/") + 1);
        wopiHostAndFile = wopiHostAndFile.replaceAll(fileName, fileName.replace(".", "_"));
        String accessToken = getToken(fileName);
        return getDocumentLink(wopiHostAndFile, ext, action, accessToken);
    }

    private static String getToken(String wopiHostAndFile) throws UnsupportedEncodingException {
        KeyGen keyGen = new KeyGen();
        return URLEncoder.encode(keyGen.getHash(wopiHostAndFile), "UTF-8");
    }

    /**
     * 浏览地址
     *
     * @param wopiHostAndFile 文件URL
     * @param ext             文件格式
     * @param action          操作方式
     * @param accessToken     访问令牌
     * @return 浏览地址
     * @throws Exception
     */
    public static String getDocumentLink(String wopiHostAndFile, String ext, String action, String accessToken) throws Exception {
        String fullPath = "";
        action = StringUtils.isEmpty(action) ? "view" : action;
        WopiDiscoveryEnum wopiDiscoveryEnum = WopiDiscoveryEnum.getActionExt(ActionEnum.getType(action), ext);
        if (null == wopiDiscoveryEnum) {
            throw new Exception("Can't locate UrlSrc for : " + wopiHostAndFile);
        }

        Integer endPoint = wopiDiscoveryEnum.getUrlsrc().indexOf('?');
        String endAction = wopiDiscoveryEnum.getUrlsrc().substring(0, endPoint);

        wopiHostAndFile = URLEncoder.encode(wopiHostAndFile, "UTF-8");
        if (ext.contains("pdf")) {
            fullPath = String.format(wopiHostFormatPdf, endAction, wopiHostAndFile, accessToken);
        } else {
            fullPath = String.format(wopiHostFormat, endAction, wopiHostAndFile, accessToken);
        }
        return fullPath;
    }
}
