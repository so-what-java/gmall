package com.zk.gmall.user.controller;

import com.zk.gmall.user.bean.UmsMember;
import com.zk.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "hello user";
    }

    /**
     * 无条件获取所有用户信息
     * @return
     */
    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

}
