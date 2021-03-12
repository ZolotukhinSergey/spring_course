package com.zolotukhin.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    //@Override
    public void getBook(String bookNme){
        System.out.println("Мы берем книгу из UniLibrary "
        + bookNme);
    }

    public String returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "OK";
    }

    public void getMagazine(int a){
        System.out.println("Мы берем журнал из UniLibrary");
    }
}
