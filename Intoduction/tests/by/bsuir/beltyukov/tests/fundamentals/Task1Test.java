package by.bsuir.beltyukov.tests.fundamentals;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.bsuir.beltyukov.fundamentals.Tasks;

public class Task1Test {
    @Test 
    public void calcYT001() {
        double x = 5, y = 3.5;
        double realResult;
        double expectedResult = 5.235033034127;
        
        realResult = Tasks.calculateByFormula(x, y);
        Assert.assertEquals(expectedResult, realResult, 0.000000001);
    }
    
    @Test 
    public void calcYT002() {
        double x = -5, y = 1.33;
        double realResult;
        double expectedResult = -4.814987508097;
        
        realResult = Tasks.calculateByFormula(x, y);
        Assert.assertEquals(expectedResult, realResult, 0.000000001);
    }
}