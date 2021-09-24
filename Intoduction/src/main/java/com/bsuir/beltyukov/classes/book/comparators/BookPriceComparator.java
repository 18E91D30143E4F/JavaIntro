package main.java.com.bsuir.beltyukov.classes.book.comparators;

import java.util.Comparator;

import main.java.com.bsuir.beltyukov.classes.book.Book;

public class BookPriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return Integer.compare(o1.getPrice(), o2.getPrice());
	}

}
