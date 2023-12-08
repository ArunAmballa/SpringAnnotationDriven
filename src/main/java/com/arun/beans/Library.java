package com.arun.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="library")
public class Library 
{
	@Autowired
	@Qualifier("dsa")
	private Book book;
	
	public Library()
	{
		System.out.println("Libraray Object is Created");
	}

	@Override
	public String toString() {
		return "Library [book=" + book + "]";
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Library(Book book) {
		super();
		this.book = book;
	}
	
	public boolean selection()
	{
		return book.bookSelected();
	}
	

}
