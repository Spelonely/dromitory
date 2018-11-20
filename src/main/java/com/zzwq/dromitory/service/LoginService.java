package com.zzwq.dromitory.service;

import com.zzwq.dromitory.common.ServerResponse;
import com.zzwq.dromitory.entity.User;

public interface LoginService {
    ServerResponse<User> login(String name,String password);
}
