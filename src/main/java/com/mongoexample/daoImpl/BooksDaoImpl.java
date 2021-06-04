package com.mongoexample.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mongoexample.dao.BooksDao;
import com.mongoexample.model.Books;

@Repository
@Transactional
public class BooksDaoImpl implements BooksDao{

	@Override
	public List<Books> booksDaoAll() {
		return null;
	}

}
