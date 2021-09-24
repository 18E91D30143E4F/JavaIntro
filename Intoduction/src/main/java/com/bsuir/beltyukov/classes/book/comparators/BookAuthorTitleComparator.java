package main.java.com.bsuir.beltyukov.classes.book.comparators;

import java.util.Comparator;

import main.java.com.bsuir.beltyukov.classes.book.Book;

public class BookAuthorTitleComparator implements Comparator<Book> {

    Comparator<Book> comparator;
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public BookAuthorTitleComparator() {
        this.comparator = (Comparator<Book>)new BookAuthorComparator().thenComparing((Comparator)new BookNameComparator());
    }
	
	@Override
	public int compare(Book book1, Book book2) {
		return this.comparator.compare(book1, book2);
	}

}
