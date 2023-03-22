package com.kuang.pojo;

/**
 * ClassName: Hello
 * Package: com.kuang.pojo
 * Description:
 *
 * @Date: 2023-03-21 021 18:18
 * @Author: wangkejing
 */
public class Hello {
    private String str;

    public Hello(String str) {
        this.str = str;
    }

    public Hello() {
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
