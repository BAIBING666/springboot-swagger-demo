package com.swagger.springbootswaggerdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.swagger.springbootswaggerdemo.request.GetUserRequest;
import com.swagger.springbootswaggerdemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;

/**
 * @program: springboot-swagger-demo
 * @description:
 * @author: bing.bai
 * @create: 2021-08-19 11:40
 */
@RestController
@Api(
    value = "用户相关接口",
    tags = {"用户操作接口"})
public class UserController {

  @Autowired
  private UserService userService;

  /**
   * @param name 姓名
   * @return 用户信息
   */
  @RequestMapping("/getUser")
  @ApiOperation(value = "获取用户信息", notes = "注意问题点 : name为必传")
  public JSONObject getUser(@ApiParam(name = "name", value = "用户名") String name) {
    JSONObject jsonObject = new JSONObject();
    GetUserRequest request=new GetUserRequest();
    //  request.setTraceId("213");
    request.setUserName("dasd");
    userService.getUserByName(request);
    jsonObject.put("user", name);
    return jsonObject;
  }
}
