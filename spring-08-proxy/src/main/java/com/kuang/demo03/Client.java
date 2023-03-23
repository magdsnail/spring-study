package com.kuang.demo03;

/**
 * ClassName: Client
 * Package: com.kuang.demo03
 * Description:
 *
 * @Date: 2023-03-23 023 14:56
 * @Author: wangkejing
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

    }
}
