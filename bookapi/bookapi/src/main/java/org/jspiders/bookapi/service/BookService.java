package org.jspiders.bookapi.service;

import org.jspiders.bookapi.model.Book;
import org.jspiders.bookapi.repositary.BookRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService
{
     @Autowired
    private BookRepositary repositary;
     public List<Book>getBooks(){
         List<Book>bookList=repositary.findAll();
         return bookList;
     }
     public Book getBookById(int id){
         Book b=repositary.findById(id).orElse(null);
         return b;
     }
     public void addBook(Book b){
         repositary.save(b);
     }
     public void updateBook(Book b){
         repositary.save(b);
     }
     public void deleteById(int id){
         repositary.deleteById(id);
     }
}
