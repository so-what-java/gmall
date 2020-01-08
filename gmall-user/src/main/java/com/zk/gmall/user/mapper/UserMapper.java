package com.zk.gmall.user.mapper;

import com.zk.gmall.user.bean.UmsMember;

import java.util.List;

public interface UserMapper {
    List<UmsMember> selectAllUser();
}
