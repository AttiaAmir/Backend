package com.example.bookservice.repository;


import com.example.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByBorrowerUserId(Long id);
    List<Book> findAllByActive(boolean active) ;
}
