package com.kuang.demo04;

import com.kuang.demo02.UserService;
import com.kuang.demo02.UserServiceImpl;

/**
 * ClassName: Client
 * Package: com.kuang.demo04
 * Description:
 *
 * @Date: 2023-03-23 023 15:40
 * @Author: wangkejing
 */
public class Client {
    public static void main(String[] args) {

        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);

        UserService proxy = (UserService)pih.getProxy();
        proxy.add();


    }
}
