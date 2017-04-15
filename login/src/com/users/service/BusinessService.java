package com.users.service;

import com.users.domain.User;

public interface BusinessService {

    User login(String username, String password);
}
