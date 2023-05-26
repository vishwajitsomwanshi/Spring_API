package org.jspiders.bookapi.controller;

import org.jspiders.bookapi.model.Book;
import org.jspiders.bookapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController
{
    @Autowired
    private BookService service;
    @GetMapping("/books")
    public List<Book> getBooks(){
        return service.getBooks();
    }
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id)
    {
        return service.getBookById(id);
    }
    @PostMapping("/books")
    public void addBook(@RequestBody Book b){
        service.addBook(b);
    }
    @PutMapping("/books")
    public void updateBook(@RequestBody Book b)
    {
        service.updateBook(b);
    }
    @DeleteMapping("/books/{id}")
    public void deleteById(@PathVariable int id){
        service.deleteById(id);
    }
}
