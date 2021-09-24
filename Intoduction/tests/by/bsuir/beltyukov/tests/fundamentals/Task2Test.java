package by.bsuir.beltyukov.tests.fundamentals;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.bsuir.beltyukov.fundamentals.Tasks;

public class Task2Test {
    @Test 
    public void calcYT001() {
        double x = 5, y = 3.5;
        boolean realResult;
        boolean expectedResult = false;
        
        realResult = Tasks.isOwnRegion(x, y);
        Assert.assertEquals(expectedResult, realResult);
    }
    
    @Test 
    public void calcYT002() {
        double x = 4, y = 3.5;
        boolean realResult;
        boolean expectedResult = true;
        
        realResult = Tasks.isOwnRegion(x, y);
        Assert.assertEquals(expectedResult, realResult);
    }
    
    @Test 
    public void calcYT003() {
        double x = -5, y = -2;
        boolean realResult;
        boolean expectedResult = true;
        
        realResult = Tasks.isOwnRegion(x, y);
        Assert.assertEquals(expectedResult, realResult);
    }
    
    @Test 
    public void calcYT004() {
        double x = -6, y = -2;
        boolean realResult;
        boolean expectedResult = true;
        
        realResult = Tasks.isOwnRegion(x, y);
        Assert.assertEquals(expectedResult, realResult);
    }
    
    @Test 
    public void calcYT005() {
        double x = -7, y = -2;
        boolean realResult;
        boolean expectedResult = false;
        
        realResult = Tasks.isOwnRegion(x, y);
        Assert.assertEquals(expectedResult, realResult);
    }
}
