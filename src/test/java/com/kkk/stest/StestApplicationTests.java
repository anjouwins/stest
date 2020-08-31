package com.kkk.stest;

import com.kkk.stest.entity.Book;
import com.kkk.stest.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class StestApplicationTests {
    @Autowired
    private BookRepository bookRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void save() {
        Book book = new Book();
        book.setName("一天学会java");
        book.setAuthor("kkk");
        Book book1 = bookRepository.save(book);
        System.out.println(book1);

    }

    @Test
    void findById() {
        Book book = bookRepository.findById(3).get();
        System.out.println(book);
    }

    @Test
    void update() {
        Book book = new Book();
        book.setId(34);
        book.setName("test test");
       Book book1 = bookRepository.save(book);
        System.out.println(book1);
    }
    @Test
    void delete(){
        if(bookRepository.existsById(59)){
        bookRepository.deleteById(59);}
    }
}