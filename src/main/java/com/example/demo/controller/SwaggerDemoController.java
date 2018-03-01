package com.example.demo.controller;

import com.example.demo.Interface.UserMapper;
import com.example.demo.Repostitory.UserRepostitory;
import com.example.demo.entity.UserModel;
import com.example.demo.model.ResultEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Admin on 2018/3/1.
 */
@RestController
@RequestMapping("api")
@Api("swaggerDemoController相关的api")
public class SwaggerDemoController {
    @Autowired
    private UserRepostitory userRepostitory;
    @Autowired
    private UserMapper userMapper;

    @ApiOperation(value="获取所有用户信息", notes="获取所有用户信息")
    @RequestMapping(value="/findAll", method= RequestMethod.GET)
    public ResultEntity findAll() {
        ResultEntity resultEntity=new ResultEntity();
        List<UserModel> all = userRepostitory.findAll();
        resultEntity.setData(all);
        return resultEntity;
    }
}
