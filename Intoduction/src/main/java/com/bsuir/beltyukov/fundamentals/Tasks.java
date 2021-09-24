package main.java.com.bsuir.beltyukov.fundamentals;

import java.math.BigInteger;
import java.util.ArrayList;

public class Tasks {
	
    // Task 1
    public static double calculateByFormula(double x, double y) {
        double numerator = 1 + Math.sin(x + y) * Math.sin(x + y);
        double denominator = 2 + Math.abs(x - (2 * x) / (1 + x * x * y * y));

        double expressionValue = numerator / denominator + x;

        return expressionValue;
    }
    // ENDTASK

    // Task 2
    public static boolean isOwnRegion(double x, double y) {
        boolean condition = ((x >= -4 && x <= 4) &&
                (y >= 0 && y <= 5)) ||
            ((x >= -6 && x <= 6) &&
                (y >= -3 && y <= 0));
        return condition;
    }
    // ENDTASK
    
    // Task 3
    // printTable(calculateOnSegment(-2, 4, 0.21));
    public static double[][] calculateOnSegment(double a, double b, double h) {
        double[][] table;
        int tableHeight;
        
        tableHeight = (int) Math.floor(Math.abs(b - a) / h + 1);
        table = new double[tableHeight][2];

        int n = 0;
        for (double value = a; value <= b; value += h, ++n) {
            table[n][0] = value;
            table[n][1] = Math.tan(value);
        }

        return table;
    }

    public static void printTable(double[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.format("%+.3f ", table[i][j]);
            }
            System.out.println();
        }
    }
    // ENDTASK

	// Task 4
    public static ArrayList<Integer> getSimpleNumber(int n) {
        int[] randArray = new int[n];
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int)(Math.random() * 100);
            BigInteger bigInteger = BigInteger.valueOf(randArray[i]);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(randArray[i]));

            if (probablePrime) {
            	result.add(randArray[i]);
            }
        }
        
        return result;
    }
    // ENDTASK
    
    // Task 5
	public static int getMinElements(int[] sequence) {
		
        int maxIncLen = 0, curInLen = 0;
        boolean isIncrease;

        for (int i = 0; i < sequence.length; i++) {
            isIncrease = true;
            curInLen = 1;
            for (int j = i + 1; (j < sequence.length) && isIncrease; j++) {
                if (sequence[j - 1] < sequence[j]) {
                	curInLen++;
                } else {
                    isIncrease = false;
                }
            }
            maxIncLen = Math.max(maxIncLen, curInLen);
        }
        return sequence.length - maxIncLen;
    }
    // ENDTODO

    // Task 6
    // printTable(getSquareMatrix(generateArray(6)));
    public static double[][] getSquareMatrix(double[] numbers) {
        int arrayHeight = numbers.length;
        double[][] matrix = new double[arrayHeight][arrayHeight];

        for(int i = 0; i < arrayHeight; i++ ) {
            int k = i;
            for(int j = 0; j < arrayHeight; j++) {
                matrix[i][j] = numbers[k];
                if(k < arrayHeight - 1) {
                    k++;
                }
                else
                {
                    k = 0;
                }
            }
        }

        return matrix;
    }

    public static double[] generateArray(int n) {
        double[] randArray = new double[n];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int)(Math.random() * 100);
        }

        return randArray;
    }
    // ENDTASK

    // Task 7
    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i ++) {
            int minIndex = min(array, i, n - 1);
            swap(array, i, minIndex);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private static int min(int[] array, int begin, int end) {
        int minVal = array[begin];
        int minIndex = begin;
        for (int i = begin + 1; i <= end; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    // ENDTASK
    
    // Task 8
    public static String sequenceProblem(double[] a, double[] b) {
        int aLen = a.length;
        int bLen = b.length;
        String result = "";
        
        for(int i = 0; i < bLen; i++) {
            for(int j = 1; j < aLen; j++) {
                if(b[i] > a[j-1] && b[i] < a[j] ) {
                	result += String.format("Enter %3f after %3f\n", b[i], a[j-1]);
                }
            }
        }
        
        return result;
    }
    // ENDTASK
    
}