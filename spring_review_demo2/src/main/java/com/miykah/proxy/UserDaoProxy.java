package com.miykah.proxy;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author miykah
 * @create 2021-11-23 20:28
 */
public class UserDaoProxy implements InvocationHandler {

    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("方法之前执行---"+method.getName() + " : 传递的参数为---" + Arrays.toString(args));

        Object res = method.invoke(obj, args);

        System.out.println("方法之后执行---" + obj);

        return res;
    }
}
