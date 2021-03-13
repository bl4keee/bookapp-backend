package com.bartekbooks.booksapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "books")
public class Book {

    @Id
    private String bookId;

    private String title;

    private String author;

    private String description;

    private String imgUrl;

    private Double price;

    private String code;

}
