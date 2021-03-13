package com.bartekbooks.booksapi.repository;

import com.bartekbooks.booksapi.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "bookdata", path = "bookdata")
public interface BookRepository extends MongoRepository<Book, String> {
}
