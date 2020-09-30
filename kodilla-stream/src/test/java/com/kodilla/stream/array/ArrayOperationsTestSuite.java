package com.kodilla.stream.array;
import org.junit.Assert;
import org.junit.Test;
public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){

        //Give
        int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(10.5,average,0.01);
    }
}