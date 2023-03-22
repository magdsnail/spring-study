package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * ClassName: People
 * Package: com.kuang.pojo
 * Description:
 *
 * @Date: 2023-03-22 022 13:57
 * @Author: wangkejing
 */
public class People {
//    //如果显式定义了autowired的required属性为false 说明这个对象可以问null 否则不允许为空
//    //@Nullable 字段标记了这个注解 说明这个字段可以为null
//    @Autowired
////    @Qualifier(value = "dog")//指定xml中定义的bean中的id
//    private Cat cat;
//
//    @Autowired
//    private Dog dog;


    @Resource //java中自动装配 @Resource(name="cat")
    private Cat cat;

    @Resource
    private Dog dog;
    private  String name;

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    public People(Cat cat, Dog dog, String name) {
        this.cat = cat;
        this.dog = dog;
        this.name = name;
    }

    public People() {
    }
}
