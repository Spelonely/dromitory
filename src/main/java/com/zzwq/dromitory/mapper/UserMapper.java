package com.zzwq.dromitory.mapper;

import com.zzwq.dromitory.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User login(String name);
}
