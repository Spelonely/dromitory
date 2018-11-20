package com.zzwq.dromitory.service.impl;

import com.zzwq.dromitory.entity.User;
import com.zzwq.dromitory.mapper.UserMapper;
import com.zzwq.dromitory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String name) {
        User user = userMapper.login(name);
        if(user!=null){
            return user;
        }
        return null;
    }
}
