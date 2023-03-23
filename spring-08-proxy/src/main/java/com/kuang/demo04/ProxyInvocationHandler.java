package com.kuang.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: ProxyInvocationHandler
 * Package: com.kuang.demo03
 * Description:
 *
 * @Date: 2023-03-23 023 14:19
 * @Author: wangkejing
 */
//等会我们会用这个类 自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //处理代理实例
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制实现
        addLog(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void addLog(String msg) {
        System.out.println("执行了" + msg + "方法");
    }


}
