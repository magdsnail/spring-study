package com.kuang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * ClassName: AfterLog
 * Package: com.kuang.log
 * Description:
 *
 * @Date: 2023-03-24 024 14:04
 * @Author: wangkejing
 */
public class AfterLog implements AfterReturningAdvice {
    //returnValue 返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "返回结果为" + returnValue);
    }
}
