package com.example.library.book.lmbook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.library.book.lmbook.model.BookDto;

@Service
public class BookServiceImpl implements BookService {

    private final List<BookDto> books = new ArrayList<>();

    @Override
    public List<BookDto> findAllBooks() {
        return new ArrayList<>(books);  // Return a copy to avoid modifications
    }

    @Override
    public BookDto findBookById(UUID id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public BookDto saveBook(BookDto bookDto) {
        if (bookDto.getId() == null) {
            bookDto.setId(UUID.randomUUID());
        }
        books.add(bookDto);
        return bookDto;
    }

    @Override
    public void deleteBook(UUID id) {
        books.removeIf(book -> book.getId().equals(id));
    }
    
}
