package com.Thinkitive.Compare;

import java.util.Comparator;

import com.Thinkitive.Book;

public class CompareBooksByName implements Comparator<Book>{

	@Override
	public int compare(Book book1, Book book2) {
		return book1.getName().compareTo(book2.getName());
	}
}
