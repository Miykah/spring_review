package com.miykah.proxy;

import com.miykah.dao.UserDao;
import com.miykah.dao.UserDaoImpl;

import java.lang.reflect.Proxy;

/**
 * @author miykah
 * @create 2021-11-23 20:29
 */
public class JDKProxy {

    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();

        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));

        int result = dao.add(1,2);

        System.out.println(result);

    }

}
