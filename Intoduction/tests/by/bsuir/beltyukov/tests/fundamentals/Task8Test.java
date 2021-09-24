package by.bsuir.beltyukov.tests.fundamentals;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.bsuir.beltyukov.fundamentals.Tasks;

public class Task8Test {
	
    @Test 
    public void calcYT001() {
    	double[] sequence1 = new double[]{1,2,3,3,4,4,5,5,11};
    	double[] sequence2 = new double[]{-1,3,4,4,5,5,5,6,7,7,9,9,9};
    	
        String realResult;
        String expectedResult;
        
        realResult = Tasks.sequenceProblem(sequence1, sequence2);
        expectedResult = realResult;
        Assert.assertEquals(realResult, expectedResult);
    }
}
