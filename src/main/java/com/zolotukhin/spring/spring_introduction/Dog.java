package com.zolotukhin.spring.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
// bean default dog
//@Scope("singleton")
//@Scope("prototype")
public class Dog implements Pet{
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @PostConstruct
//    private void init(){
//        System.out.println("Class Dog: init method");
//    }
//
//    @PreDestroy
//    protected void destroy(){
//        System.out.println("Class Dog: destroy method");
//    }

    public Dog(){
        System.out.println("Dog bean created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
