package com.Thinkitive;

import java.util.Set;

public class Book {

	private int id;
	private String name;
	private Set<Author> authors;
	private int price;
	
	public Book(int id, String name, Set<Author> authors, int price) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authors=" + authors + ", price=" + price + "]";
	}
}
