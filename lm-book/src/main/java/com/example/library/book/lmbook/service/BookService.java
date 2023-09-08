package com.example.library.book.lmbook.service;

import java.util.List;
import java.util.UUID;

import com.example.library.book.lmbook.model.BookDto;

public interface BookService {
    
    List<BookDto> findAllBooks();

    BookDto findBookById(UUID id);

    BookDto saveBook(BookDto book);

    void deleteBook(UUID id);

}
