package com.cspm.oos.service.impl;

import com.cspm.oos.config.OfficeOnlineServerProperties;
import com.cspm.oos.service.OfficeOnlineServerService;
import com.cspm.oos.util.Base64Util;
import com.cspm.oos.util.WopiAppHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Service
public class OfficeOnlineServerServiceImpl implements OfficeOnlineServerService {

    private final OfficeOnlineServerProperties properties;

    @Autowired
    public OfficeOnlineServerServiceImpl(OfficeOnlineServerProperties properties) {
        this.properties = properties;
    }

    /**
     * 根据文件名获取文件绝对路径
     *
     * @param name 文件名称
     * @return 文件绝对路径
     * @author CHENQUAN
     * @date 2018年3月21日
     */
    @Override
    public String getFilePath(String name) {
        return properties.getLocalResourcePath() + name.substring(name.indexOf("/resource/"));
    }

    /**
     * 返回文件下载流
     *
     * @param name     文件名称
     * @param response
     * @return 下载流
     * @author CHENQUAN
     * @date 2018年3月21日
     */
    @Override
    public void getFile(String name, HttpServletResponse response) {
        String filePath = getFilePath(name);
        try {
            // path是指欲下载的文件的路径。
            File file = new File(filePath);
            // 取得文件名。
            String filename = file.getName();
            String contentType = "application/octet-stream";
            // 以流的形式下载文件。
            InputStream fis = new BufferedInputStream(new FileInputStream(filePath));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            // 清空response
            response.reset();
            // 设置response的Header
            response.addHeader("Content-Disposition", "attachment;filename=" + new String(filename.getBytes("utf-8"), "ISO-8859-1"));
            response.addHeader("Content-Length", "" + file.length());
            OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
            response.setContentType(contentType);
            toClient.write(buffer);
            toClient.flush();
            toClient.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 获取office在线预览链接
     *
     * @param fileName 文件名称
     * @param action   操作
     * @param request
     * @return
     * @author CHENQUAN
     * @date 2017年9月13日
     */
    @Override
    public String getLink(String fileName, String action, HttpServletRequest request) {
        //当前项目URL地址
        String serverURL = request.getScheme() + "://" + request.getServerName() + (request.getServerPort() == 80 ? "" :
                ":" + request.getServerPort()) + request.getContextPath();
        //得到当前系统WOPI接口完整URL
        String wopiServer = serverURL + "/wopi/files/";
        try {
            return WopiAppHelper.getDocumentLink(properties.getOosUrl(), wopiServer + Base64Util.getBase64(fileName),
                    fileName.substring(fileName.lastIndexOf('.') + 1), action);
        } catch (Exception e) {
            return null;
        }
    }
}
