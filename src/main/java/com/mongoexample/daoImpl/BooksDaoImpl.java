package com.mongoexample.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mongoexample.dao.BooksDao;
import com.mongoexample.model.Books;
import com.mongoexample.model.Topics;

@Repository
@Transactional
public class BooksDaoImpl implements BooksDao{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<Books> booksDaoAll() {
		return mongoTemplate.findAll(Books.class);
	}

	@Override
	public void saveDao(Books books) {
		mongoTemplate.save(books, "books");
		
	}

	@Override
	public void saveTopic(Topics topic, String id) {
		

		Update update = new Update();
		update.addToSet("topics", topic);
		Criteria criteria = Criteria.where("_id").is(id);
		mongoTemplate.updateFirst(Query.query(criteria), update, "books");
		
	}

	
}
