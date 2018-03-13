package com.example.demo.service.impl;

import com.example.demo.Repostitory.UserRepostitory;
import com.example.demo.entity.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Admin on 2018/3/13.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepostitory userRepostitory;

    @Override
    @Cacheable(value = "userModel")
    public UserModel findById(Integer id) {
        UserModel userModel=userRepostitory.findOne(id);
        return userModel;
    }
}
