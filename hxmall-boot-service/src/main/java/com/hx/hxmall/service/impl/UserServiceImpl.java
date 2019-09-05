package com.hx.hxmall.service.impl;

import com.hx.hxmall.dao.UserDao;
import com.hx.hxmall.entity.sys.User;
import com.hx.hxmall.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User load(int id) {
        return userDao.load(id);
    }
}
