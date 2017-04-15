package com.users.service.impl;

import com.users.dao.UserDao;
import com.users.dao.impl.UserDaoImpl;
import com.users.domain.User;
import com.users.service.BusinessService;

public class BusinessServiceImpl implements BusinessService {

    private UserDao dao = new UserDaoImpl();

    @Override
    public User login(String username, String password) {
        return dao.find(username,password);
    }
}
