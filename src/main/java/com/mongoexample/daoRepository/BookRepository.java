package com.mongoexample.daoRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongoexample.model.Books;

public interface BookRepository extends MongoRepository<Books, String>{

}
