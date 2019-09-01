package com.karakal.struts.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;

import java.io.IOException;

/**
 * Copyright (c) 2019, 北京卡拉卡尔科技股份有限公司 All rights reserved.
 *
 * @author eran.zhan@karakal.com.cn (zhaneran)
 * @version 1.0
 * @since 2019/8/13 16:14
 */
@Controller("loginAction")
@Log
public class LoginAction extends ActionSupport {

    private String name;
    private String password;

    @Override
    public String execute() throws IOException {
        log.info("用户名：" + name);
        log.info("密码：" + password);
        log.info("进入首页！！！");
        ActionContext.getContext().put("name", name);
        ActionContext.getContext().put("password", password);
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
