package com.zolotukhin.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    //@Pointcut("execution(* com.zolotukhin.spring.aop.UniLibrary.*(..))")
    //private void allMethodsFromUniLibrary(){}
    //
    //@Pointcut("execution(public void com.zolotukhin.spring.aop.UniLibrary.returnMagazine())")
    //private void returnMagazineFromUniLibrary(){}
    //
    //@Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    //private void allMethodExceptReturnMagazineFromUniLibrary(){}
    //
    //@Before("allMethodExceptReturnMagazineFromUniLibrary()")
    //public void beforeAllMethodExceptReturnMagazineAdvice(){
    //    System.out.println("beforeAllMethodExceptReturnMagazineAdvice: Log #10");
    //}

    //@Pointcut("execution(* " +
    //    "com.zolotukhin.spring.aop.UniLibrary.get*())")
    //private void allGetMethodsFromUniLibrary(){}
    //
    //@Pointcut("execution(* " +
    //    "com.zolotukhin.spring.aop.UniLibrary.return*())")
    //private void allReturnMethodsFromUniLibrary(){}
    //
    //@Pointcut("allGetMethodsFromUniLibrary() || " +
    //    "allReturnMethodsFromUniLibrary()")
    //private void allGetAndReturnMethodsFromUniLibrary(){}
    //
    //@Before("allGetMethodsFromUniLibrary()")
    //public void beforeGetLoggingAdvice(){
    //    System.out.println("beforeGetLoggingAdvice: writing Log #1");
    //}
    //
    //@Before("allReturnMethodsFromUniLibrary()")
    //public void beforeReturnLoggingAdvice(){
    //    System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    //}
    //
    //@Before("allGetAndReturnMethodsFromUniLibrary()")
    //public void beforeGetAndReturnLoggingAdvice(){
    //    System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    //}

    //@Before("execution(public void com.zolotukhin.spring.aop.UniLibrary.getBook())")
    //@Before("execution(public void get*())")
    //@Before("execution(public void getBook(String))")
    //@Before("execution(public void *(*))")
    //@Before("execution(* *(*))")
    //@Before("execution(public void getBook(..))")
    //@Before("execution(public void getBook(com.zolotukhin.spring.aop.Book, ..))")
    //@Before("execution(public void getBook(com.zolotukhin.spring.aop.Book))")
    @Before("com.zolotukhin.spring.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: " +
        "логирование попытки взять книгу/журнал");
    }

    //@Before("execution(* returnBook())")
    //public void beforeReturnBookAdvice(){
    //    System.out.println("beforeReturnBookAdvice: " +
    //    "логирование попытки вернуть книгу");
    //}

}
