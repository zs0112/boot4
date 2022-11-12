package com.example.boot4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import xier.dao.BookDao;
import xier.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@ComponentScan("xier")
@MapperScan("xier.dao")
class Boot4ApplicationTests {
    @Autowired
    BookDao bookDao;
    @Test
    void contextLoads() {
        List<Book> list = bookDao.selectList(null);
        System.out.println(list);
    }

}
