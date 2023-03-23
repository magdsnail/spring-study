package com.kuang.demo01;

/**
 * ClassName: Proxy
 * Package: com.kuang.demo01
 * Description:
 *
 * @Date: 2023-03-23 023 11:00
 * @Author: wangkejing
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public void rent() {
        host.rent();
        seeHouse();
        hetong();
        fare();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    //签合同
    public void hetong() {
        System.out.println("签租赁合同");
    }

    //收中介费
    public void fare() {
        System.out.println("收中介费");
    }

}
