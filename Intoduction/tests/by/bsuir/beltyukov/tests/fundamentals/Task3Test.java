package by.bsuir.beltyukov.tests.fundamentals;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.bsuir.beltyukov.fundamentals.Tasks;

public class Task3Test {
    @Test 
    public void calcYT001() {
        double a = 2, b = 5, h = 1;
        double[][] realResult;
        double[][] expectedResult = { {2.0, -2.185039863261519},
        							  {3.0, -0.1425465430742778},
        							  {4.0, 1.1578212823495777},
        							  {5.0, -3.380515006246586}
        							};
        
        realResult = Tasks.calculateOnSegment(a, b, h);
        
        Assert.assertArrayEquals(realResult, expectedResult); // junit super!!!
    }
}
