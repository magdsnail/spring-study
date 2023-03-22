package com.kuang.pojo;

/**
 * ClassName: Address
 * Package: com.kuang.pojo
 * Description:
 *
 * @Date: 2023-03-22 022 10:51
 * @Author: wangkejing
 */
public class Address {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
