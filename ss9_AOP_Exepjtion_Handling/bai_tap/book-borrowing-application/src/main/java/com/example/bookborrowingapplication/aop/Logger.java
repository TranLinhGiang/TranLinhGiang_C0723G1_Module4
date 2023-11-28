package com.example.bookborrowingapplication.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    static int count = 0;

    @After("execution(* com.example.bookborrowingapplication.controller.*(..))")
    public void countShowForm() {
        count++;
        System.out.println("---------------------");
        System.out.println("Số lần người dùng truy cập" + count);
    }
}
