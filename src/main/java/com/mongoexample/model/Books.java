package com.mongoexample.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Books {
	
	public String id;
	public String name;
	public String author;
	public int price;
	
	public Books(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

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
	
	

}
