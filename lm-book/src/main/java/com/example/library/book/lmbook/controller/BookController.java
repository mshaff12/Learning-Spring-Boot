package com.example.library.book.lmbook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.book.lmbook.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
    
    private final BookService bookService;

}
