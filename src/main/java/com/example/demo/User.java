package com.example.demo;

/**
 * Created by Admin on 2018/2/23.
 */
public class User {
    private String mail;
    private String name;
    private String password;
    private String descript;
    private String age;

    public User(String mail, String name, String password, String descript, String age) {
        this.mail = mail;
        this.name = name;
        this.password = password;
        this.descript = descript;
        this.age = age;
    }
}
