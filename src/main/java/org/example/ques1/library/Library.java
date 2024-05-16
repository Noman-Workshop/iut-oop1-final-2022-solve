package org.example.ques1.library;

import org.example.ques1.library.isbn.ISBN;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	
	private final List<Book> collection = new ArrayList<>();
	
	public void addBook(Book book) {
		collection.add(book);
	}
	
	public void removeBook(Book book) {
		collection.remove(book);
	}
	
	
	public List<Book> searchByTitle(String title) {
		return collection.stream()
		                 .filter(book -> book.getTitle()
		                                     .equals(title))
		                 .collect(Collectors.toList());
	}
	
	public List<Book> searchByAuthor(String author) {
		return collection.stream()
		                 .filter(book -> book.getAuthor()
		                                     .equals(author))
		                 .collect(Collectors.toList());
	}
	
	public List<Book> searchByIsbn(ISBN isbn) {
		return collection.stream()
		                 .filter(book -> book.getIsbn()
		                                     .equals(isbn))
		                 .collect(Collectors.toList());
	}
	
}
