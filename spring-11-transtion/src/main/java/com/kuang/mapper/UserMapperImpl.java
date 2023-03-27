package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * ClassName: UserMapperImpl
 * Package: com.kuang.mapper
 * Description:
 *
 * @Date: 2023-03-27 027 14:51
 * @Author: wangkejing
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    public List<User> selectUser() {

        User user = new User(7, "xiaoyangzi", "123456");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(7);

        return mapper.selectUser();
    }

    public int addUser(User user) {


        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
