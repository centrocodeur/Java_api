package com.mtaps.book.api.execption;

public class BookNotFoundException extends RuntimeException {
  
    public BookNotFoundException (Long id){
      super("Could not find book with id: "+ id);
    }
   
}
