package com.users.dao.impl;

import com.users.dao.UserDao;
import com.users.domain.User;
import com.users.util.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserDaoImpl implements UserDao {

    private QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void save(User user) {
        try {
            qr.update("insert into users(username,password,birthday,gender,email) values(?,?,to_date(?,'yyyy-mm-dd'),?,?)",
                    user.getUsername(),user.getPassword(),sdf.format(user.getBirthday()),user.getGender(),user.getEmail());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
