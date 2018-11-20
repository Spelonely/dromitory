package com.zzwq.dromitory.service.impl;

import com.zzwq.dromitory.common.ServerResponse;
import com.zzwq.dromitory.entity.User;
import com.zzwq.dromitory.mapper.UserMapper;
import com.zzwq.dromitory.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> login(String name, String password) {
        User user = userMapper.login(name);
        if(user!=null){
            if(user.getPassword().equals(password)){
                return ServerResponse.createBySuccess("登陆成功",user);
            }else {
                return ServerResponse.createByError("密码或账号输入有误");
            }
        }
        return ServerResponse.createByError("账号不存在");
    }
}
