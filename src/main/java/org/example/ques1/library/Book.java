package org.example.ques1.library;

import org.example.ques1.library.isbn.ISBN;

public class Book {
	
	private final String identifier;
	private final String title;
	private final String author;
	private final ISBN isbn;
	private final int pages;
	
	public Book(String identifier, String title, String author, ISBN isbn, int pages) {
		this.identifier = identifier;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.pages = pages;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public ISBN getIsbn() {
		return isbn;
	}
	
	public int getPages() {
		return pages;
	}
}
