package com.swagger.springbootswaggerdemo.aop;


import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springboot-swagger-demo
 * @description:
 * @author: bing.bai
 * @create: 2021-08-19 14:55
 **/
@ControllerAdvice
public class ExceptionHandlerClass {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JSONObject exceptionHandler(Exception e){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("errMsg",e.getMessage());
        jsonObject.put("code",-1);
        return jsonObject;
    }
}
