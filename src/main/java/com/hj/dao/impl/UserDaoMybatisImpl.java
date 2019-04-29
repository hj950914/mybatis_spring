package com.hj.dao.impl;

import com.hj.dao.UserDao;
import com.hj.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Author: hj
 * Date: 2019-04-29 17:11
 * Description: <描述>
 */

@Repository("UserDao1")
public class UserDaoMybatisImpl implements UserDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    //根据用户名查询用户信息
    @Override
    public User selectByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        return userDao.selectByUsername(username);
    }

    //新增用户
    @Override
    public void insert(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        if (sqlSession == null) {
            System.out.println("连接获取失败");
        }
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.insert(user);
    }

}

