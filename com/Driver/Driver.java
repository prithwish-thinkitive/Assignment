package com.Driver;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.Thinkitive.Author;
import com.Thinkitive.Book;
import com.Thinkitive.PrintUtil;
import com.Thinkitive.StoreUtil;
import com.Thinkitive.Compare.SortUtil;

public class Driver {

	public static void main(String args[]) {
		
		Author a1 = new Author(1, "Author23");
		Author a11 = new Author(1, "Author29");
		Author a12 = new Author(1, "Author33");
		Author a13 = new Author(1, "Author44");
		Set<Author> authorSet = new HashSet<>();
		authorSet.add(a1);
		authorSet.add(a11);
		authorSet.add(a12);
		authorSet.add(a13);
		Book b1 = new Book(1, "ABCD", authorSet, 1000);
		
		Author a2 = new Author(1, "Mark");
		Author a21 = new Author(1, "Adam");
		Author a22 = new Author(1, "George");
		Author a23 = new Author(1, "Harry");
		Set<Author> authorSet1 = new HashSet<>();
		authorSet.add(a2);
		authorSet.add(a21);
		authorSet.add(a22);
		authorSet.add(a23);
		Book b2 = new Book(2, "ACAD", authorSet1, 1200);
		
		Author a3 = new Author(1, "AmartaSen");
		Author a31 = new Author(1, "Shakespeare");
		Author a32 = new Author(1, "Hathaway");
		Author a33 = new Author(1, "Frank");
		Set<Author> authorSet3 = new HashSet<>();
		authorSet.add(a3);
		authorSet.add(a31);
		authorSet.add(a32);
		authorSet.add(a33);
		Book b3 = new Book(3, "AACD", authorSet3, 900);
		
		StoreUtil<Book> store = new StoreUtil<Book>();
		
		store.addRecord(b1);
		store.addRecord(b2);
		store.addRecord(b3);
		
		List<Book> list = store.getRecord();
		
		PrintUtil<Book> print = new PrintUtil<Book>();
		print.printRecords(list);
		
		SortUtil sort = new SortUtil();
		sort.sortByName(list);
		
		print.printRecords(list);
		
		sort.sortByPrice(list);
		
		print.printRecords(list);
	}
}
