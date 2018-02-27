package com.example.demo.Repostitory;

import com.example.demo.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Admin on 2018/2/26.
 */
public interface UserRepostitory extends JpaRepository<UserModel,Integer> {
}
