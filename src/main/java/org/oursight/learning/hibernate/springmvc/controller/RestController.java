package org.oursight.learning.hibernate.springmvc.controller;

import org.oursight.learning.hibernate.bo.User;
import org.oursight.learning.hibernate.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by neyao@github.com on 2016/3/11.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

    @Autowired
    private UserDAO userDao;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUserNameInRequestParameter(@RequestParam(value="name", defaultValue = "zhangsan") String name) {

        System.out.println();
        System.out.println("------------------");
        System.out.println("getUserNameInRequestParameter: " + name);
        System.out.println("------------------");
        System.out.println();

        User user = userDao.find(name);
        return user;
    }

    @RequestMapping(value = "/user/{userName}", method = RequestMethod.GET)
    public User getUserNameInPathVariable(@PathVariable String userName) {

        System.out.println();
        System.out.println("------------------");
        System.out.println("getUserNameInPathVariable: " + userName);
        System.out.println("------------------");
        System.out.println();

        User user = userDao.find(userName);
        return user;
    }


}
