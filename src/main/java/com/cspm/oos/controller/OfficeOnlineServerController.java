package com.cspm.oos.controller;

import com.cspm.oos.core.Result;
import com.cspm.oos.dto.OfficeFileInfoDto;
import com.cspm.oos.enums.ActionEnum;
import com.cspm.oos.service.OfficeOnlineServerService;
import com.cspm.oos.util.Base64Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 在线预览Office文件服务
 *
 * @author CHENQUAN
 * @date 2018年3月21日
 */
@Slf4j
@Controller
@RequestMapping("/wopi")
@Api(value = "/wopi", description = "在线预览Office文件服务")
public class OfficeOnlineServerController {
    private final OfficeOnlineServerService officeOnlineServerService;

    @Autowired
    public OfficeOnlineServerController(OfficeOnlineServerService officeOnlineServerService) {
        this.officeOnlineServerService = officeOnlineServerService;
    }

    /**
     * 获取office在线预览链接
     *
     * @param fileName 文件名称
     * @param action   操作类型
     * @author CHENQUAN
     * @date 2017年9月14日
     */
    @ApiOperation("获取office在线预览链接")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "fileName", value = "文件名称", paramType = "query", required = true, dataType = "string"),
            @ApiImplicitParam(name = "action", value = "操作类型", paramType = "query", required = true, dataType = "string")
    })
    @RequestMapping(value = "/link/getLink", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Result getLink(String fileName, String action, HttpServletRequest request) {
        Result result;
        if (StringUtils.isEmpty(fileName)) {
            result = new Result(100, "待浏览文件URL不能为空！");
        } else if (!StringUtils.isEmpty(action) && ActionEnum.getType(action) == null) {
            result = new Result(101, "操作类型有误！");
        } else {
            String link = officeOnlineServerService.getLink(fileName, action, request);
            if (link != null) {
                result = new Result(1, "成功！", link);
            } else {
                result = new Result(102, "无法获取预览连接！");
            }
        }
        return result;
    }

    /**
     * 获取文件属性
     * D:\bc_resource/resource/file/2017/12/15/20171215144937135WREV.docx
     *
     * @param name 文件名称
     * @author CHENQUAN
     * @date 2017年9月14日
     */
    @ApiOperation("获取文件属性")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "文件名称", paramType = "query", required = true, dataType = "string"),
            @ApiImplicitParam(name = "access_token", value = "访问令牌", paramType = "query", required = true, dataType = "string")
    })
    @RequestMapping(value = "/files/{name}", method = RequestMethod.GET)
    public void getFileInfo(@PathVariable("name") String name, @RequestParam("access_token") String accessToken,
                            HttpServletResponse response) {
        if (StringUtils.isEmpty(name)) {
            return;
        }
        name = Base64Util.getFromBase64(name);
        String filePath = officeOnlineServerService.getFilePath(name);
        PrintWriter out = null;
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json;charset=UTF-8");
            response.setHeader("X-WOPI-SessionContext", "SessionContext");
            out = response.getWriter();
            OfficeFileInfoDto dto = getFileInfo(filePath);
            log.info(dto.toStringTrim());
            out.print(dto.toStringTrim());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    /**
     * 获取文件内容
     *
     * @param name 获取文件内容
     * @author CHENQUAN
     * @date 2017年9月14日
     */
    @ApiOperation("获取文件属性")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "文件名称", paramType = "query", required = true, dataType = "string")
    })
    @RequestMapping(value = "/files/{name}/contents", method = {RequestMethod.POST, RequestMethod.GET})
    public void getFile1(@PathVariable("name") String name, HttpServletResponse response) {
        officeOnlineServerService.getFile(Base64Util.getFromBase64(name), response);
    }


    /**
     * 获取文件基本信息
     *
     * @param filePath 文件路径
     * @return OfficeFileInfoDto
     * @author CHENQUAN
     * @date 2017年9月14日
     */
    private OfficeFileInfoDto getFileInfo(String filePath) {
        File file = new File(filePath);
        OfficeFileInfoDto dto = new OfficeFileInfoDto();
        if (file.exists()) {
            // 取得文件名
            dto.setBaseFileName(file.getName());
            dto.setSize((int) file.length());
            dto.setOwnerId("admin");
            dto.setVersion(String.valueOf(file.lastModified()));
            dto.setFileExtension(file.getName().substring(file.getName().lastIndexOf(".")));
            dto.setAllowExternalMarketplace(true);
            dto.setSHA256(getHash256(file));
        }
        return dto;
    }

    /**
     * 获取文件SHA256
     *
     * @param file 文件
     * @return SHA256
     * @author CHENQUAN
     * @date 2017年9月14日
     */
    private String getHash256(File file) {
        String value = "";
        // 获取hash值
        try {
            byte[] buffer = new byte[1024];
            int numRead;
            InputStream fis = new FileInputStream(file);
            //如果想使用SHA-1或SHA-256，则传入SHA-1,SHA-256
            MessageDigest complete = MessageDigest.getInstance("SHA-256");
            do {
                //从文件读到buffer
                numRead = fis.read(buffer);
                if (numRead > 0) {
                    //用读到的字节进行MD5的计算，第二个参数是偏移量
                    complete.update(buffer, 0, numRead);
                }
            } while (numRead != -1);

            fis.close();
            value = new String(Base64.encodeBase64(complete.digest()));
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
