package com.users.dao;

import com.users.domain.User;

/**
 * Created by hou on 2017/4/15.
 */
public interface UserDao {

    User find(String username, String password);
}
