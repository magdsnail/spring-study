package com.kuang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * ClassName: AnnotainPointCut
 * Package: com.kuang.diy
 * Description:
 *
 * @Date: 2023-03-24 024 15:54
 * @Author: wangkejing
 */
//方式三 使用注解方式实现AOP
@Aspect //标注这个类是一个切面
public class AnnotainPointCut {

    @Before("execution(* com.kuang.service.UserServiceImpl.*())")
    public void before() {
        System.out.println("====方法执行前=====");
    }

    @After("execution(* com.kuang.service.UserServiceImpl.*())")
    public void after() {
        System.out.println("====方法执行后=======");
    }

    //在环绕增强中 我们可以给定一个参数  代表我们要处理切入的点
    @Around("execution(* com.kuang.service.UserServiceImpl.*())")
    public void around(ProceedingJoinPoint jp) {
        System.out.println("环绕前");
//        Signature signature = jp.getSignature();//获得签名
//        System.out.println(signature);
        try {
            Object proceed = jp.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        System.out.println("环绕后");
    }

}
