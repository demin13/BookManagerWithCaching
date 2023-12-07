package com.shekhar.BookManager;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Long>{
    Optional<BookModel> findById(Long id);
    List<BookModel> findAll();
    void deleteById(Long id);
    
}
