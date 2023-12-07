package com.shekhar.BookManager;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bookstore")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = true, length = 100)
    private String author;

    @Column(nullable = true, length = 12)
    private String isbn;

    @Column(nullable = true)
    private int year;

    @Column(nullable = true)
    private int number_of_pages;

    public BookModel(String name, String author, String isbn, int year, int pages){
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.number_of_pages = pages;
    }

}
