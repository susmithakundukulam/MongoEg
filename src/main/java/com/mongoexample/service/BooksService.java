package com.mongoexample.service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongoexample.dao.BooksDao;
import com.mongoexample.daoRepository.BookRepository;
import com.mongoexample.model.Books;

@Service
public class BooksService {
	
	@Autowired
	BooksDao booksDao;
	
	@Autowired
	BookRepository bookRepository;
	
	public List<Books> booksAll(){
		return bookRepository.findAll();
	}
	
	public void booksSave(Books books) {
		bookRepository.save(books);
	}
	
	
	public List<Books> booksDaoAll(){
		return booksDao.booksDaoAll();
	}

}
