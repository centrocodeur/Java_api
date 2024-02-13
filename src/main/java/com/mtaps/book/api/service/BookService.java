package com.mtaps.book.api.service;

import java.util.List;

import com.mtaps.book.api.entity.Book;

public interface BookService {
  
  List<Book> getAllBooks();

  Book getBookById(Long id);

  Book saveBook(Book book);
  Book updateBook(Long id, Book updateBook);
  
  void deleteBook(Long id);

}
