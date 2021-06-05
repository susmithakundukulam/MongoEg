package com.mongoexample.dao;

import java.util.List;

import com.mongoexample.model.Books;

public interface BooksDao {
	public List<Books> booksDaoAll();
	public void saveDao(Books books);
	
}
