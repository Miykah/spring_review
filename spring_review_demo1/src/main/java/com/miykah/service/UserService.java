package com.miykah.service;

import com.miykah.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author miykah
 * @create 2021-11-23 19:33
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    @Value(value = "123")
    private String str;

    public void add(){
        System.out.println("service add...");
        System.out.println(str);
        userDao.add();
    }

}
