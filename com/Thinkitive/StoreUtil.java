package com.Thinkitive;

import java.util.ArrayList;
import java.util.List;

public class StoreUtil<T> {

	List<T> list = new ArrayList<>();
	
	public void addRecord(T book) {
		list.add(book);
	}
	public List<T> getRecord() {
		return list;
	}
	public int getNumberOfRecords() {
		return list.size();
	}
}
