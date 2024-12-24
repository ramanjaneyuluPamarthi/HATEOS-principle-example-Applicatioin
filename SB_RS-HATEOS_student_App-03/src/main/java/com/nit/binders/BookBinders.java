package com.nit.binders;

import org.springframework.hateoas.RepresentationModel;

public class BookBinders extends RepresentationModel<BookBinders> {

	private String isbn;
	private String name;
	private Double price;
	private String author;
	
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	public BookBinders() {

	}
	public BookBinders(String isbn, String name, Double price, String author) {
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.author = author;
	}


	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "BookBinders [isbn=" + isbn + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	
		
}
