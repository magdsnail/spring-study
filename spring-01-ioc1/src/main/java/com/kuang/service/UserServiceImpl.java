package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;

/**
 * ClassName: UserServiceImpl
 * Package: com.kuang.service
 * Description:
 *
 * @Date: 2023-03-21 021 17:11
 * @Author: wangkejing
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;
    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void getUser() {
        userDao.getUser();
    }

}
