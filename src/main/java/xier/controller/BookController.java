package xier.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import xier.service.IBookService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 希儿
 * @since 2022-11-08
 */
@RestController
@RequestMapping("/book")
public class BookController {
@Autowired
    IBookService bookService;
}

