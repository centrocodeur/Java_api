package com.mtaps.book.api.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @Basic(optional = false)
     @Column
     private String title;

     @Basic(optional = false)
     @Column
     private String author;
  
}
