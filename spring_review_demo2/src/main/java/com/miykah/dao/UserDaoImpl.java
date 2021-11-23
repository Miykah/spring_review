package com.miykah.dao;

/**
 * @author miykah
 * @create 2021-11-23 20:26
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
