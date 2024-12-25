package com.example.goodreads;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    BookService bookservice = new BookService();

    @GetMapping("/books")
    public ArrayList<Book> getbooks() {
        return bookservice.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getbook(@PathVariable("bookId") int bookId) {
        return bookservice.getBookById(bookId);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookservice.addBook(book);
    }

    @PutMapping("/books/{bookId}")
    public Book updateBook(@PathVariable("bookId") int bookId, @RequestBody Book book) {
        return bookservice.updateBook(bookId, book);
    }

    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId) {
        bookservice.deleteBook(bookId);
    }

}
