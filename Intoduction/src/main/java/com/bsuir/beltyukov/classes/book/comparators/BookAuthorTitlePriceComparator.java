package main.java.com.bsuir.beltyukov.classes.book.comparators;

import java.util.Comparator;

import main.java.com.bsuir.beltyukov.classes.book.Book;

public class BookAuthorTitlePriceComparator implements Comparator<Book> {

    private Comparator<Book> comparator;
    
    public BookAuthorTitlePriceComparator() {
        this.comparator = new BookAuthorTitleComparator().thenComparing((Comparator<? super Book>)new BookPriceComparator());
    }
	
	@Override
	public int compare(Book o1, Book o2) {
		return this.comparator.compare(o1, o2);
	}

}
