package com.cspm.oos.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; /**
 * 在线预览
 * @author CHENQUAN
 * @date 2018年3月21日
 */
public interface OfficeOnlineServerService {
    /**
     * 根据文件名获取文件绝对路径
     *
     * @param name 文件名称
     * @return 文件绝对路径
     * @author CHENQUAN
     * @date 2018年3月21日
     */
    String getFilePath(String name);

    /**
     * 返回文件下载流
     *
     * @param name     文件名称
     * @param response
     * @return 下载流
     * @author CHENQUAN
     * @date 2018年3月21日
     */
    void getFile(String name, HttpServletResponse response);
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
    String getLink(String fileName, String action, HttpServletRequest request);
}
