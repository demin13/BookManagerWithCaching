package com.shekhar.BookManager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/book/")
public class Controller {
    
    @Autowired
    private BookService bookService;

    @PostMapping("add/")
    public BookModel addBook(@RequestBody BookDTO bookDTO){
        return bookService.createBook(bookDTO);
    }

    @GetMapping("get/")
    public List<BookModel> findAllBook(){
        return bookService.findAll();
    }

    @GetMapping("get/{id}")
    public Optional<BookModel> findById(@PathVariable Long id){
        return bookService.findBookById(id);
    }

    @DeleteMapping("remove/{id}")
    public ResponseEntity<Object> deleteBook(@PathVariable Long id){
        bookService.deleteBookById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Book Deleted Successfully.");
    }

}
