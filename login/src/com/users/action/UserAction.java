package com.users.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.users.domain.User;
import com.users.service.BusinessService;
import com.users.service.impl.BusinessServiceImpl;
import org.apache.struts2.ServletActionContext;

/**
 * Created by hou on 2017/4/15.
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{

    private BusinessService s = new BusinessServiceImpl();
    private User user = new User();
    @Override
    public User getModel() {
        return user;
    }

    public String login(){
        User u=s.login(user.getUsername(),user.getPassword());
        if(u == null){
            return LOGIN;
        }
        ServletActionContext .getRequest().getSession().setAttribute("user",u);
        return SUCCESS;
    }

}
