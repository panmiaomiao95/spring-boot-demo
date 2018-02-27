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
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

/**
 * Created by Admin on 2018/2/22.
 */
//@RestController //直接返回json的注解
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

    /**
     * redis的session共享
     * @param session
     * @return
     */
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

    /**
     * jpa查询所有
     * @return
     */
    @GetMapping("/users")
    @ResponseBody
    public ResultEntity findAll() {
        ResultEntity resultEntity=new ResultEntity();
        List<UserModel> all = userRepostitory.findAll();
        resultEntity.setData(all);
        return resultEntity;
    }

    /**
     * mybatis根据id查询
     * @return
     */
    @GetMapping("/findOne")
    @ResponseBody
    public ResultEntity findById(){
        ResultEntity resultEntity=new ResultEntity();
        UserModel userModel=userMapper.getOne(12054);
        resultEntity.setData(userModel);
        return  resultEntity;
    }

    /**
     * mybatis查询所有
     * @return
     */
    @GetMapping("/mybatis_findAll")
    @ResponseBody
    public ResultEntity mybatisFindAll() {
        ResultEntity resultEntity=new ResultEntity();
        List<UserModel> all = userMapper.findAll();
        resultEntity.setData(all);
        return resultEntity;
    }

    @GetMapping("/mybatis_delete")
    @ResponseBody
    public ResultEntity mybatisDelete(){
        ResultEntity resultEntity=new ResultEntity();
        userMapper.deleteById(12054);
        resultEntity.setCode(200);
        resultEntity.setMsg("删除成功!!");
        return resultEntity;
    }

    @GetMapping("/mybatis_insert")
    @ResponseBody
    public ResultEntity mybatisInsert(){
        ResultEntity resultEntity=new ResultEntity();
        UserModel userModel=new UserModel();
        userModel.setAge(27);
        userModel.setBirthday("1991-10-26");
        userModel.setPassworld("123456");
        userModel.setUsername("紫霞仙子");
        userModel.setHobby("游戏");
        userMapper.insert(userModel);
        resultEntity.setCode(200);
        resultEntity.setData(userModel);
        return  resultEntity;
    }
}
