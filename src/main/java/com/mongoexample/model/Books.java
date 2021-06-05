package com.mongoexample.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Books {
	
	@Id
	private String id;
	private String name;
	private String author;
	private int price;
	private List<Topics> topics;
	
	
	
	/*
	 * public Books(String name, String author, int price) { this.name = name;
	 * this.author = author; this.price = price; }
	 */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	public List<Topics> getTopics() {
		return topics;
	}

	public void setTopics(List<Topics> topics) {
		this.topics = topics;
	}

	@Override
	  public String toString() {
	    return "Books [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	  }
	
	public void addTopics(Topics topic) {
		if(topics == null) {
			topics = new ArrayList<Topics>();
			topics.add(topic);
		}else { 
			topics.add(topic);
		}
	}
	

}
