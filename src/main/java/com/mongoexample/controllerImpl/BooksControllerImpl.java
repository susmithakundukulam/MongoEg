package com.mongoexample.controllerImpl;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mongoexample.controller.BooksController;
import com.mongoexample.model.Books;
import com.mongoexample.model.Topics;
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
		System.out.println("***********************booksAdd**************************");
		booksService.booksSave(books) ;
	}

	@Override
	public List<Books> booksDaoAll() {
		return booksService.booksDaoAll();
	}

	@Override
	public void booksDaoAdd(Books books) {
		booksService.booksDaoSave(books) ;
		
	}

	@Override
	public void booksDaoUpdate(Books books) {
		booksService.booksDaoUpdate(books) ;
		
	}

	@Override
	public void topicsObjAdd(Topics topics,String id) {
		// ****method 1***
		//		Books books = booksService.getById(id);
		//		books.addTopics(topics);
		//		booksService.booksSave(books) ;
		
		// ****method 1***
		Books books = booksService.getByIdsaveTopic(id, topics);
		booksService.booksSave(books) ;
	}

	@Override
	public void topicsObjAddAI(Topics topics, String id) {
		booksService.saveTopic(topics,id);
	}

}
