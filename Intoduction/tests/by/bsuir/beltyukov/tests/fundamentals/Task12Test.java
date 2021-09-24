package by.bsuir.beltyukov.tests.fundamentals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.java.com.bsuir.beltyukov.classes.book.Book;

public class Task12Test {
	
	@Test
	public void testEquals() {
		Book book1 = new Book("Поле чудес", "Пушкин", 20, 1);
		Book book2 = new Book("Поле чудес", "Пушкин", 20, 1);
		Book book3 = new Book("Собаки", "Тушеный", 25, 3);
		
		Assertions.assertTrue(book1.equals((Object)book2));
		Assertions.assertEquals(0, book1.compareTo(book2));
        Assertions.assertFalse(book1.equals((Object)book3));
	}
	
}
