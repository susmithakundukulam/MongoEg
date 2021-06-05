package com.mongoexample.daoRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mongoexample.model.Books;

public interface BookRepository extends MongoRepository<Books, String>{
	
	
	 @Query(value="{ 'name' : ?0 }", fields="{ 'name' : 1, 'author' : 1, 'price' :1}")
	Books findByName(String name);
	 
	 @Query(value="{name : ?0}", fields="{name : 0}")
	 Books findByName1(String name);

}
