package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;

/**
 * ClassName: UserMapper
 * Package: com.kuang.mapper
 * Description:
 *
 * @Date: 2023-03-25 025 11:40
 * @Author: wangkejing
 */
public interface UserMapper {
    List<User> selectUser();
}
