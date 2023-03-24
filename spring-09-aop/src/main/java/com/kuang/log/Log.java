package com.kuang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * ClassName: Log
 * Package: com.kuang.log
 * Description:
 *
 * @Date: 2023-03-24 024 13:58
 * @Author: wangkejing
 */
public class Log implements MethodBeforeAdvice {
    //method 要执行的目标对象的方法
    //args: 参数
    //target 目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
