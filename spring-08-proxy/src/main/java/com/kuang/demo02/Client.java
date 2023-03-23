package com.kuang.demo02;

/**
 * ClassName: Client
 * Package: com.kuang.demo02
 * Description:
 *
 * @Date: 2023-03-23 023 11:16
 * @Author: wangkejing
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
    }
}
