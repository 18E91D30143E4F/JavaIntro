package by.bsuir.beltyukov.tests.fundamentals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.bsuir.beltyukov.fundamentals.Tasks;

public class Task7Test {
    @Test 
    public void calcYT001() {
        int[] data = new int[] { 5, 4, 3, 2, 1 };
        int[] expectedResult = new int[] { 1, 2, 3, 4, 5};
        
        Tasks.sort(data);
        Assert.assertArrayEquals(data, expectedResult); 
    }
    
    @Test 
    public void calcYT002() {
        int[] data = new int[] { -5, 2, 6, 17, 19, 3, 0, -9, 2 };
        int[] dataCopy = new int[] { -5, 2, 6, 17, 19, 3, 0, -9, 2 };
        
        Arrays.sort(data);
        Tasks.sort(dataCopy);
        
        Assert.assertArrayEquals(data, dataCopy); 
    }
	
}
