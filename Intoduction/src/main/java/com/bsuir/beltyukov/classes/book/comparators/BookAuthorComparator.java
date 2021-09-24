package main.java.com.bsuir.beltyukov.classes.book.comparators;

import java.util.Comparator;

import main.java.com.bsuir.beltyukov.classes.book.Book;

public class BookAuthorComparator implements Comparator<Book> {
	
	@Override
	public int compare(Book o1, Book o2) {	
		return o1.getAuthor().compareTo(o2.getAuthor());
	}
}
