package com.miykah.dao.impl;

import com.miykah.dao.UserDao;
import org.springframework.stereotype.Controller;

/**
 * @author miykah
 * @create 2021-11-23 19:39
 */
@Controller
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add...");
        System.out.println("dao add2...");
    }
}
