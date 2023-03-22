package com.kuang.pojo;

/**
 * ClassName: User
 * Package: com.kuang.pojo
 * Description:
 *
 * @Date: 2023-03-22 022 09:57
 * @Author: wangkejing
 */
public class User {
    private String name;

//    public User() {
//        System.out.println("user的无参构造");
//    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name="+name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
