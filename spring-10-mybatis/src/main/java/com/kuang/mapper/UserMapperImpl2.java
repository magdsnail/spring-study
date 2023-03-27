package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * ClassName: UserMapperImpl2
 * Package: com.kuang.mapper
 * Description:
 *
 * @Date: 2023-03-27 027 14:03
 * @Author: wangkejing
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapperImpl.class).selectUser();
    }
}
