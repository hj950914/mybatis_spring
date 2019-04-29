package com.hj;

import com.hj.dao.UserDao;
import com.hj.dao.impl.UserDaoMybatisImpl;
import com.hj.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: hj
 * Date: 2019-04-29 19:02
 * Description: <描述>
 */
public class Test {

    @org.junit.jupiter.api.Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao) ac.getBean("UserDao");
        User user = new User();
        user.setUsername("hj");
        user.setPassword("123456");
        userDao.insert(user);
    }

    @org.junit.jupiter.api.Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao) ac.getBean("UserDao");
        User user = userDao.selectByUsername("hj");
        System.out.println(user);
    }

    /*
     * 没有自己定义Dao的实现类,而是通过spring.xml里面配置Dao的实现类,简化操作
     * */
    @org.junit.jupiter.api.Test
    public void test2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        User user = new User();
        user.setUsername("hj1");
        user.setPassword("1234567");
        userDao.insert(user);
    }
}
