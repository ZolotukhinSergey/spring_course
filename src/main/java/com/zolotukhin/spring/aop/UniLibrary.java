package com.zolotukhin.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    //@Override
    //public void getBook(Book book){
    //    System.out.println("Мы берем книгу из UniLibrary "
    //    + book.getName());
    //}
    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary");
    }

    //public String returnBook(){
    //    System.out.println("Мы возвращаем книгу в UniLibrary");
    //    return "OK";
    //}

    public void returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал в UniLibrary");
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из UniLibrary");
    }

    public void addBook(){
        System.out.println("Мы добавляем книгу в UniLibrary");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в UniLibrary");
    }
}
