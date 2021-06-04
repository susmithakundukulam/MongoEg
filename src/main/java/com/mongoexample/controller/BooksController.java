package com.mongoexample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mongoexample.model.Books;

@RequestMapping("/books")
public interface BooksController {
	
	@RequestMapping(value = "/booksAll", method = RequestMethod.GET )
	public List<Books> booksAll();
	
	@RequestMapping(value = "/booksAdd", method = RequestMethod.POST /* ,consumes = "application/json" */)
	public void booksAdd(Books books);
	
	@RequestMapping(value = "/booksDaoAll", method = RequestMethod.GET )
	public List<Books> booksDaoAll();
	
	
}
