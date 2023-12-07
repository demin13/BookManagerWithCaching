package com.shekhar.BookManager;

import java.io.Serializable;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO implements Serializable{
    private String name;
    private String author;
    private String isbn;
    private int year;
    private int number_of_pages;
}
