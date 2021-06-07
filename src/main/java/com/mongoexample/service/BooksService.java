package com.mongoexample.service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongoexample.dao.BooksDao;
import com.mongoexample.daoRepository.BookRepository;
import com.mongoexample.model.Books;
import com.mongoexample.model.Topics;

@Service
public class BooksService {
	
	@Autowired
	BooksDao booksDao;
	
	@Autowired
	SequenceGenerator sequence;
	
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

	public void booksDaoSave(Books books) {
		booksDao.saveDao(books);
	}
	
	public void booksDaoUpdate(Books books) {
		Books book = bookRepository.findByName(books.getName());
		System.out.println("*************************************************");
		System.out.println(book.getId());
		book.setPrice(books.getPrice());
		bookRepository.save(book);
	}
	 
	public Books getByName(String name) {
		Books book = bookRepository.findByName1(name);
		return book;
	}
	
	public Books getById(String id) {
		Optional<Books> book = bookRepository.findById(id);
		System.out.println(book.get().getId());
		return book.get();
	}
	
	public Books getByIdsaveTopic(String id,Topics topic) {
		Optional<Books> book = bookRepository.findById(id);
		System.out.println(book.get().getId());
		book.get().addTopics(topic);
		return book.get();
	}
	
	public void saveTopic(Topics topic, String id) {
		topic.setId(sequence.generateSequence(Topics.SEQUENCE_NAME));
		booksDao.saveTopic(topic,id);
	}
}
