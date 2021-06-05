package com.mongoexample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mongoexample.model.Books;
import com.mongoexample.model.Topics;

@RequestMapping("/books")
public interface BooksController {
	
	@RequestMapping(value = "/booksAll", method = RequestMethod.GET )
	public List<Books> booksAll();
	
	@RequestMapping(value = "/booksAdd", method = RequestMethod.POST  ,consumes = "application/json" )
	public void booksAdd(@RequestBody Books books);
	
	@RequestMapping(value = "/booksDaoAll", method = RequestMethod.GET )
	public List<Books> booksDaoAll();
	
	@RequestMapping(value = "/booksDaoAdd", method = RequestMethod.POST ,consumes = "application/json" )
	public void booksDaoAdd(@RequestBody Books books);
	
	
	@RequestMapping(value = "/booksDaoUpdate", method = RequestMethod.PUT ,consumes = "application/json" )
	public void booksDaoUpdate(@RequestBody Books books);
	
	@RequestMapping(value = "/topicsObjAdd", method = RequestMethod.POST  ,consumes = "application/json" )
	public void topicsObjAdd(@RequestBody Topics topics);
	
}
