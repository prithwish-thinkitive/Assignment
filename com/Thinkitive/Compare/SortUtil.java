package com.Thinkitive.Compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.sound.sampled.Line;

import com.Thinkitive.Book;

public class SortUtil{

	public void sortByName(List<Book> list) {
		
		Collections.sort(list, new CompareBooksByName());
	}
	public void sortByPrice(List<Book> list) {
		Collections.sort(list, new CompareBooksByPrice());
	}
}
