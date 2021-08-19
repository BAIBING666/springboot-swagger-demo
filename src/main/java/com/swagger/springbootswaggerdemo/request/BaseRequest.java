package com.swagger.springbootswaggerdemo.request;

import javax.validation.constraints.NotBlank;

/**
 * @program: springboot-swagger-demo
 * @description:
 * @author: bing.bai
 * @create: 2021-08-19 14:04
 */
public class BaseRequest {
  @NotBlank(message = "traceId不能为空")
  private String traceId;

  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }
}
