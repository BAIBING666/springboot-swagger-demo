package com.swagger.springbootswaggerdemo.aop;

import com.swagger.springbootswaggerdemo.request.BaseRequest;
import com.swagger.springbootswaggerdemo.util.ValidationUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springboot-swagger-demo
 * @description:
 * @author: bing.bai
 * @create: 2021-08-19 14:08
 */
@Aspect
@Component
public class ValidationAop {

  @Pointcut("execution( * com.swagger.springbootswaggerdemo.service.UserService.*(..))")
  public void checkParams() {}

  @Before("checkParams()")
  public void dowithParams(JoinPoint joinPoint) {
    Object[] args = joinPoint.getArgs();
    BaseRequest request1 = (BaseRequest) args[0];
    ValidationUtils.validate(request1);
  }
}
