package by.bsuir.beltyukov.tests.fundamentals;

import java.util.ArrayList;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.bsuir.beltyukov.fundamentals.Tasks;

public class Task4Test {
	
	private static boolean isPrime(int number) {
	    return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
	}
	
    @Test 
    public void calcYT001() {
        ArrayList<Integer> realResult = Tasks.getSimpleNumber(20);
        boolean expectedResult = true;
        
        for(Integer num : realResult) {
        	if (!isPrime(num.intValue())) {
        		expectedResult = false;
        		break;
        	}
        }
        
        
        Assert.assertEquals(expectedResult, true);
    }
}
