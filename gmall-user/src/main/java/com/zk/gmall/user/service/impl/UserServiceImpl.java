package com.zk.gmall.user.service.impl;

import com.zk.gmall.user.bean.UmsMember;
import com.zk.gmall.user.mapper.UserMapper;
import com.zk.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAllUser();
        return umsMembers;
    }
}
