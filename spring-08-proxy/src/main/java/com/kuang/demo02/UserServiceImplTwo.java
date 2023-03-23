package com.kuang.demo02;


/**
 * ClassName: UserServiceImplTwo
 * Package: com.kuang.demo02
 * Description:
 *
 * @Date: 2023-03-23 023 16:22
 * @Author: wangkejing
 */
public class UserServiceImplTwo implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void update() {
        System.out.println("更新 了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}
