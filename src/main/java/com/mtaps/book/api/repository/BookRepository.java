package com.mtaps.book.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtaps.book.api.entity.Book;

public interface BookRepository extends JpaRepository <Book,Long> {
  
}
