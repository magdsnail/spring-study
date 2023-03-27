package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * ClassName: UserMapperImpl
 * Package: com.kuang.mapper
 * Description:
 *
 * @Date: 2023-03-27 027 11:30
 * @Author: wangkejing
 */
public class UserMapperImpl implements UserMapper{

//我们的所有操作 都使用sqlSession来执行在原来    现在都使用sqlSessionTemplate;
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
