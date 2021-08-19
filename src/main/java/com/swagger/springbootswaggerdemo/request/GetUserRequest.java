package com.swagger.springbootswaggerdemo.request;

import javax.validation.constraints.NotBlank;

/**
 * @program: springboot-swagger-demo
 * @description:
 * @author: bing.bai
 * @create: 2021-08-19 14:03
 **/
public class GetUserRequest extends BaseRequest{
    @NotBlank(message = "username不能为空")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
