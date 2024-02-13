package com.mtaps.book.api.service;

import java.util.List;

import java.util.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.mtaps.book.api.entity.Book;
import com.mtaps.book.api.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    
  private final BookRepository bookRepository;

  
  public BookServiceImpl(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public List<Book> getAllBooks() {
    
    return bookRepository.findAll();
  }

  @Override
  public Book getBookById(Long id) {
    return bookRepository.findById(id).orElse(null);
  }

  @Override
  public Book saveBook(Book book) {
    return bookRepository.save(book);
  }

  @Override
  public Book updateBook(Long id, Book updateBook) {
    Optional <Book> optionalExistingBook = bookRepository.findById(id);
    if(optionalExistingBook.isPresent()){
      Book existingBook= optionalExistingBook.get();
      BeanUtils.copyProperties(updateBook, existingBook, "id");
      return bookRepository.save(existingBook);
    } else{
      return null;
    }
  }

  @Override
  public void deleteBook(Long id) {
    bookRepository.deleteById(id);
  }
  
}
