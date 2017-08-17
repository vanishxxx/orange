package com.vanish.orange.service.impl;

import com.vanish.orange.dao.UserDao;
import com.vanish.orange.entity.UserDO;
import com.vanish.orange.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public void userReg(UserDO userDO) {
       userDao.insertUser(userDO);
    }
}
