package com.mongoexample.dao;

import java.util.List;

import com.mongoexample.model.Books;
import com.mongoexample.model.Topics;

public interface BooksDao {
	public List<Books> booksDaoAll();
	public void saveDao(Books books);
	public void saveTopic(Topics topic, String id);
}
