package com.vanish.orange.dao;


import com.vanish.orange.entity.UserDO;
import org.apache.ibatis.annotations.Param;


public interface UserDao {

    void insertUser(@Param("userDO") UserDO userDO);
}
