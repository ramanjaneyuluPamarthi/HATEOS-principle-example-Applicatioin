package com.nit.rest;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nit.binders.BookBinders;

@RestController
public class BookRestCOntroller {

	@GetMapping(value = "/book/{isbn}", produces = "application/json")
	public BookBinders getBokInfo(@PathVariable("isbn") String isbn) {
		BookBinders book = new BookBinders(isbn, "Spring", 300.00, "Raj");

		Link withRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestCOntroller.class).getBokInfo(isbn))
				.withRel("All-Books");
		book.add(withRel);

		return book;
	}

	@GetMapping(value = "/books",produces = "application/json")
	public List<BookBinders> getAllBooks() {
		BookBinders b1 = new BookBinders("ISBN001","Spring",900.0,"Rod Johnson");
		BookBinders b2 = new BookBinders("ISBN002","Spring",700.0,"Rod Johnson");
		BookBinders b3 = new BookBinders("ISBN003","Spring",560.0,"Rod Johnson");
		BookBinders b4 = new BookBinders("ISBN004","Spring",880.0,"Rod Johnson");
		
		List<BookBinders> books = new ArrayList<BookBinders>();
		books.add(b1);books.add(b2);books.add(b3);books.add(b4);
		return books;
	}
}
