package com.users.dao.impl;

import com.users.dao.UserDao;
import com.users.domain.User;
import com.users.util.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * Created by hou on 2017/4/15.
 */
public class UserDaoImpl implements UserDao {

    private QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());

    @Override
    public User find(String username, String password) {
        try {
            return  qr.query("select * from users where username=? and password = ?",
                    new BeanHandler<User>(User.class),username,password);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
