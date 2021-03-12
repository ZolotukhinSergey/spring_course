package com.zolotukhin.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //@Before("execution(public void com.zolotukhin.spring.aop.UniLibrary.getBook())")
    //@Before("execution(public void get*())")
    //@Before("execution(public void getBook(String))")
    @Before("execution(public void *(*))")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка взять книгу");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
    }
}
