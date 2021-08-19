package com.swagger.springbootswaggerdemo.Exception;

/**
 * @program: springboot-swagger-demo
 * @description:
 * @author: bing.bai
 * @create: 2021-08-19 13:55
 **/
public class ParamsException extends RuntimeException{
    private String errorMsg;

    private String errorParam;

    public ParamsException(String message,String param){
        super(message);
        this.setErrorParam(message);
        this.setErrorParam(param);
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorParam() {
        return errorParam;
    }

    public void setErrorParam(String errorParam) {
        this.errorParam = errorParam;
    }
}
