package com.mongoexample.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mongoexample.controller.BooksController;
import com.mongoexample.model.Books;
import com.mongoexample.service.BooksService;

@RestController
public class BooksControllerImpl implements BooksController{
	
	@Autowired
	BooksService booksService;

	@Override
	public List<Books> booksAll() {
	List<Books> bookList = booksService.booksAll();
		return bookList;
	}

	@Override
	public void booksAdd(Books books) {
		booksService.booksSave(books) ;
	}

	@Override
	public List<Books> booksDaoAll() {
		return booksService.booksDaoAll();
	}

}
