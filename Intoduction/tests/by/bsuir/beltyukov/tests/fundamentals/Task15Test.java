package by.bsuir.beltyukov.tests.fundamentals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import main.java.com.bsuir.beltyukov.classes.book.Book;

public class Task15Test {
	
	@Test
	public void testSimpleCompare() {
		Book book1 = new Book("Поле чудес", "Пушкин", 20, 6);
		Book book2 = new Book("Гагарин", "Достоевский", 5, 5);
		Book book3 = new Book("Собаки", "Тушеный", 25, 3);
		Book book4 = new Book("Мираж", "Адидас", 3, 4);
		
		int[] numberBookArray;
		
		ArrayList<Book> myBookArrayList = new ArrayList<Book>();
		
		myBookArrayList.add(book1);
		myBookArrayList.add(book2);
		myBookArrayList.add(book3);
		myBookArrayList.add(book4);
		
		Collections.sort(myBookArrayList);
		
		numberBookArray = new int[myBookArrayList.size()];
		
		int i = 0;
        for (Book book: myBookArrayList) {
        	numberBookArray[i] = book.getIsbn();
        	i++;
        }
		
        Assertions.assertTrue(isUpperSequence(numberBookArray));
	}
	
	
	private boolean isUpperSequence(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1])  {
            	return false;
            }
        }
        return true;
    }
}
