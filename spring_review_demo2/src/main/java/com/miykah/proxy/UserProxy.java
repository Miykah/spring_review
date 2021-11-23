package com.miykah.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author miykah
 * @create 2021-11-23 20:58
 */
@Component
@Aspect
public class UserProxy {

    @Before(value = "execution(* com.miykah.bean.User.add(..))")
    public void before(){
        System.out.println("before....");
    }

    @AfterReturning(value = "execution(* com.miykah.bean.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning....");
    }

    @After(value = "execution(* com.miykah.bean.User.add(..))")
    public void after(){
        System.out.println("after....");
    }

    @AfterThrowing(value = "execution(* com.miykah.bean.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing....");
    }

    @Around(value = "execution(* com.miykah.bean.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around 之前......");
        proceedingJoinPoint.proceed();
        System.out.println("around 之后......");
    }

}
