package com.example.customer_list_management.logger;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    public void error(){
        System.out.println("execution(public * com.example.customer_list_management.service.CustomerService.findAll(..))");
    }
}
