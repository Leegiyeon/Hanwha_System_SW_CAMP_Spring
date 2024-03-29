package com.ohgiraffers.section01.autowired.subsection02.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        /* 설명. subsection01에 있는 BookService 차입의 bean과 혼선을 방지하고자 bean 이름 수정*/

        BookService bookService = context.getBean("bookServiceConstructor", BookService.class);

        bookService.findAllBook().forEach(System.out::println); // ArrayList

        System.out.println(bookService.searchBookBySequence(1));
        System.out.println(bookService.searchBookBySequence(2));
    }
}
