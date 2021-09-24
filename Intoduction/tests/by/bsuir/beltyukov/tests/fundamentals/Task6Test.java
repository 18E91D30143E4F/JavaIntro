package by.bsuir.beltyukov.tests.fundamentals;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.bsuir.beltyukov.fundamentals.Tasks;

public class Task6Test {
    @Test 
    public void calcYT001() {
        double[] data = new double[] { 1, 2, 3, 4, 5 };
        double[][] realResult;
        double[][] expectedResult = 
        	    {{1.0, 2.0, 3.0, 4.0, 5.0},
        		{2.0, 3.0, 4.0, 5.0, 1.0},
        		{3.0, 4.0, 5.0, 1.0, 2.0},
        		{4.0, 5.0, 1.0, 2.0, 3.0},
        		{5.0, 1.0, 2.0, 3.0, 4.0}};
        
        realResult = Tasks.getSquareMatrix(data);
        Assert.assertArrayEquals(realResult, expectedResult); // junit super!!!
    }
    
    @Test 
    public void calcYT002() {
        double[] data = new double[] { 1,2,3 };
        double[][] realResult;
        double[][] expectedResult = 
        		{{1.0, 2.0, 3.0},
        		 {2.0, 3.0, 1.0},
        		 {3.0, 1.0, 2.0}};
        
        realResult = Tasks.getSquareMatrix(data);
        Assert.assertArrayEquals(realResult, expectedResult); // juint super!!!
    }
}
