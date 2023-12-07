package com.shekhar.BookManager;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


// import jakarta.transaction.Transactional;

@Service
public class BookService {

    // @Autowired
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public BookModel createBook(BookDTO bookDTO){
        BookModel bookModel = new BookModel();
        bookModel.setName(bookDTO.getName());
        bookModel.setAuthor(bookDTO.getAuthor());
        bookModel.setIsbn(bookDTO.getIsbn());
        bookModel.setNumber_of_pages(bookDTO.getNumber_of_pages());
        bookModel.setYear(bookDTO.getYear());
        return bookRepository.save(bookModel);
    }

    public List<BookModel> findAll() {
        return bookRepository.findAll();
    }

    public Optional<BookModel> findBookById(Long id) {
        return bookRepository.findById(id);
    }

    // @Transactional
    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }
}