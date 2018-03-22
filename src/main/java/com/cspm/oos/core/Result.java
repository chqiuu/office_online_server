package com.cspm.oos.core;


/**
 * 统一返回值
 * Created by CHQIU on 2017-04-15.
 */
public class Result {
    /**
     * flag: 1:正常执行 0:初始化 2:需要登录 100：一般错误
     */
    private int flag = 0;
    private String message = "";
    private Object content;

    /**
     * 初始化
     */
    public Result() {
        super();
        this.flag = 0;
        this.content = "";
        this.message = "";
    }

    public Result(int flag) {
        super();
        this.flag = flag;
    }

    public Result(int flag, String message) {
        super();
        this.flag = flag;
        this.message = message;
    }

    public Result(int flag, Object content) {
        super();
        this.flag = flag;
        this.content = content;
    }

    public Result(int flag, String message, Object content) {
        super();
        this.flag = flag;
        this.message = message;
        this.content = content;
    }

    public Result ok(String message) {
        return new Result(2, message);
    }

    public Result ok(Object content) {
        return new Result(2, content);
    }

    public Result ok(String message, Object content) {
        return new Result(2, message, content);
    }


    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return 具体内容Object
     */
    public Object getContent() {
        return content;
    }

    /**
     * @param content 具体内容Object
     */
    public void setContent(Object content) {
        this.content = content;
    }

    /**
     * @return 1：正常执行；0：初始化；-1：需要登录；-2：一般错误
     */
    public int getFlag() {
        return flag;
    }

    /**
     * @param flag 1：正常执行；0：初始化；-1：需要登录；-2：一般错误
     */
    public void setFlag(int flag) {
        this.flag = flag;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Result [flag=" + flag + ", message=" + message + ", content="
                + content + "]";
    }
}
