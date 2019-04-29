package com.hj.dao;

import com.hj.entity.User;

/**
 * Author: hj
 * Date: 2019-04-29 17:10
 * Description: <描述>
 */
public interface UserDao {

    public User selectByUsername(String username);

    public void insert(User user);
}
