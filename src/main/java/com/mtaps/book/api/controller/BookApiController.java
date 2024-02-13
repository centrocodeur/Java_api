package com.mtaps.book.api.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import java.util.*;

import com.mtaps.book.api.entity.Book;
import com.mtaps.book.api.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookApiController {
     
     private final BookService bookService;
    
    
    public BookApiController(BookService bookService) {
      this.bookService = bookService;
    }
   
    @GetMapping
    public List<Book> getAllBooks(){
      return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
      return bookService.getBookById(id);

    }

    @PostMapping
    public Book saveBook(@RequestBody Book book){
      return bookService.saveBook(book);
    }

    @PutExchange("/{id}")
    public ResponseEntity <Book> updateBook(@PathVariable Long id, @RequestBody Book book){
      Book updateBook= bookService.updateBook(id, book);
      if(updateBook!=null){
        return ResponseEntity.ok(updateBook);
      }else{
        return ResponseEntity.notFound().build();
      }


    }
    
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
      bookService.deleteBook(id);
    }

  
}
