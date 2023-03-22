package com.kuang.service;

import com.kuang.dao.UserDao;

/**
 * ClassName: UserService
 * Package: com.kuang.service
 * Description:
 *
 * @Date: 2023-03-21 021 17:10
 * @Author: wangkejing
 */
public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);

}
