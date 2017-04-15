package com.users.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.users.domain.User;
import com.users.service.BusinessService;
import com.users.service.impl.BusinessServiceImpl;

public class UserAction extends ActionSupport implements ModelDriven<User>{

    private BusinessService s = new BusinessServiceImpl();
    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    public String regist(){
        try {
            s.regist(user);
            return SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return ERROR;
        }
    }



}
