package com.example.demo.controller;

import com.example.demo.Interface.UserMapper;
import com.example.demo.Repostitory.UserRepostitory;
import com.example.demo.entity.UserModel;
import com.example.demo.model.ResultEntity;
import com.example.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

/**
 * Created by Admin on 2018/2/22.
 */
@Controller
public class HelloWordController {
    @Autowired
    private UserRepostitory userRepostitory;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("hello_word")
    public String index() {
        return "hello";
    }

    @RequestMapping("uid")
    @ResponseBody
    public Object uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getAttribute("uid");
    }

    @GetMapping("/users")
    @ResponseBody
    public ResultEntity findAll() {
        ResultEntity resultEntity=new ResultEntity();
        List<UserModel> all = userRepostitory.findAll();
        resultEntity.setData(all);
        return resultEntity;
    }

    @GetMapping("/findOne")
    @ResponseBody
    public ResultEntity findById(){
        ResultEntity resultEntity=new ResultEntity();
        UserModel userModel=userMapper.getOne(12054);
        resultEntity.setData(userModel);
        return  resultEntity;
    }

    @GetMapping("/mybatis_findAll")
    @ResponseBody
    public ResultEntity mybatisFindAll() {
        ResultEntity resultEntity=new ResultEntity();
        List<UserModel> all = userMapper.findAll();
        resultEntity.setData(all);
        return resultEntity;
    }
}
