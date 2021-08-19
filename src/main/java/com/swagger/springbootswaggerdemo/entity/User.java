package com.swagger.springbootswaggerdemo.entity;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @program: springboot-swagger-demo
 * @description:
 * @author: bing.bai
 * @create: 2021-08-19 14:01
 */
public class User {
  @NotBlank
  private String name;

  private String phone;

  private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
