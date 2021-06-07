package com.mongoexample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongoexample.model.Books;
import com.mongoexample.model.Topics;

@RequestMapping("/books")
public interface BooksController {
	
	//**********List All Books using MongoRepository**************************
	@RequestMapping(value = "/booksAll", method = RequestMethod.GET )
	public List<Books> booksAll();
	
	//**********Save Books using MongoRepository**************************
	@RequestMapping(value = "/booksAdd", method = RequestMethod.POST  ,consumes = "application/json" )
	public void booksAdd(@RequestBody Books books);
	
	//**********All Books using MongoTemplate**************************
	@RequestMapping(value = "/booksDaoAll", method = RequestMethod.GET )
	public List<Books> booksDaoAll();
	
	//**********Save Books using MongoTemplate**************************
	@RequestMapping(value = "/booksDaoAdd", method = RequestMethod.POST ,consumes = "application/json" )
	public void booksDaoAdd(@RequestBody Books books);
	
	//**********Update Books using MongoRepository**************************
	@RequestMapping(value = "/booksDaoUpdate", method = RequestMethod.PUT ,consumes = "application/json" )
	public void booksDaoUpdate(@RequestBody Books books);
	
	//**********Save a object in Books using MongoRepository (wrong way)**************************
	@RequestMapping(value = "/topicsObjAdd/{id}", method = RequestMethod.POST  ,consumes = "application/json" )
	public void topicsObjAdd(@RequestBody Topics topics,
			@PathVariable String id);
	
	//**********Save a object in Books using MongoRepository (right way +added autoincrement)**************************
	@RequestMapping(value = "/topicsObjAddAI/{id}", method = RequestMethod.POST  ,consumes = "application/json" )
	public void topicsObjAddAI(@RequestBody Topics topics,
			@PathVariable String id);
	
}
