package com.kuang.demo02;

/**
 * ClassName: UserServiceProxy
 * Package: com.kuang.demo02
 * Description:
 *
 * @Date: 2023-03-23 023 11:17
 * @Author: wangkejing
 */
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }
    public void update() {
        log("update");
        userService.update();
    }
    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg) {
        System.out.println("【Debug】使用了" + msg + "方法");
    }


}
