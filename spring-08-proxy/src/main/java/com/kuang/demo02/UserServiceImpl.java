package com.kuang.demo02;

/**
 * ClassName: UserServiceImpl
 * Package: com.kuang.demo02
 * Description:
 *
 * @Date: 2023-03-23 023 11:14
 * @Author: wangkejing
 */
public class UserServiceImpl implements UserService{
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
