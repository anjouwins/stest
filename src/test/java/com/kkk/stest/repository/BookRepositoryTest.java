package com.kkk.stest.repository;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;
    @Test
    void findAll(){
        System.out.println(bookRepository.findAll());
    }

}