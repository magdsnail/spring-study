package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ClassName: User
 * Package: com.kuang.dao
 * Description:
 *
 * @Date: 2023-03-22 022 21:47
 * @Author: wangkejing
 */

//等价于 <bean id="user" class="com.kuang.pojo.User"></bean>
//@Component 组件
@Component
@Scope
public class User {
//    public String name = "wangkejing";

    //相当于
    // <property name = "name" value="kuangshen"/>
    @Value("wangkejing")
    public String name;
}


















