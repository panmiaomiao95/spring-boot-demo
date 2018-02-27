package com.example.demo.Interface;

import com.example.demo.entity.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Admin on 2018/2/27.
 */
@Mapper
public interface UserMapper {
    UserModel getOne(Integer id);

    List<UserModel> findAll();

    void deleteById(Integer id);

    void insert(UserModel userModel);
}
