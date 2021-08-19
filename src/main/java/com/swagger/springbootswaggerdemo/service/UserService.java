package com.swagger.springbootswaggerdemo.service;

import com.swagger.springbootswaggerdemo.entity.User;
import com.swagger.springbootswaggerdemo.request.GetUserRequest;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-swagger-demo
 * @description:
 * @author: bing.bai
 * @create: 2021-08-19 14:00
 **/
@Service
public class UserService {

    public User getUserByName(GetUserRequest userRequest) {
        User user=new User();
        return user;
    }


}
