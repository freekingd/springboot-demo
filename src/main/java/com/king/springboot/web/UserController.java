package com.king.springboot.web;

import com.king.springboot.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuru on 2018/12/30.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public User getUser() {
        User user = new User();
        user.setName("freeking");
        user.setAge(23);
        user.setPass("123");
        return user;
    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.POST)
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setName("aqiu");
        user1.setPass("123");
        user1.setAge(12);
        User user2 = new User();
        user2.setName("aq");
        user2.setPass("1223");
        user2.setAge(123);
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}
