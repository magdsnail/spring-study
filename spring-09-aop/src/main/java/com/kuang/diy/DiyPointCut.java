package com.kuang.diy;

/**
 * ClassName: DiyPointCut
 * Package: com.kuang.diy
 * Description:
 *
 * @Date: 2023-03-24 024 15:30
 * @Author: wangkejing
 */
public class DiyPointCut {
    public void before() {
        System.out.println("===========方法执行前===========");
    }

    public void after(){
        System.out.println("===========方法执行后===========");
    }
}
