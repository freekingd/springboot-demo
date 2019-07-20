package com.king.springboot.web;

import com.king.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhuru on 2018/12/30.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("userName", "freekingaff");
        map.addAttribute("flag", "yes");
        map.addAttribute("users", getUserList());
        map.addAttribute("type", "demo");
        map.addAttribute("pageId", "springboot/2018/12/30");
        map.addAttribute("img", "http://img.zcool.cn/community/01f9ea56e282836ac72531cbe0233b.jpg@2o.jpg");
        map.addAttribute("age", 30);
        map.addAttribute("sex","star");
        return "hello";
    }

    private List<User> getUserList(){
        List<User> list=new ArrayList<User>();
        User user1=new User("大牛",12,"123456");
        User user2=new User("小牛",6,"123563");
        User user3=new User("纯洁的微笑",66,"666666");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return  list;
    }

    @RequestMapping("/adv")
    public String advanced(ModelMap map, HttpServletRequest request) {
        map.addAttribute("userName", "king");
        request.setAttribute("request", "i am request");
        request.getSession().setAttribute("session", "i am session");

        map.addAttribute("date", new Date());
        map.addAttribute("users", getUserList());
        map.addAttribute("count", 16);
        return "advanced";
    }
}
