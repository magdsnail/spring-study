package com.kuang.demo01;

/**
 * ClassName: Client
 * Package: com.kuang.demo01
 * Description:租客
 *
 * @Date: 2023-03-23 023 10:59
 * @Author: wangkejing
 */
public class Client {
    //房东要租房子
    public static void main(String[] args) {
        Host host = new Host();
        //代理 中介帮助房东租房子 但是呢 代理角色、一般会有一些附属操作
        Proxy proxy = new Proxy(host);
        //你不用面对房东 直接找中介租房即可！
        proxy.rent();
    }
}
