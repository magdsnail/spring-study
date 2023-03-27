package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;

/**
 * ClassName: UserMapper
 * Package: com.kuang.mapper
 * Description:
 *
 * @Date: 2023-03-27 027 14:48
 * @Author: wangkejing
 */
public interface UserMapper {
    List<User> selectUser();

    int addUser(User user);

    int deleteUser(int id);
}
