package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        Assert.assertEquals(emptyList, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(0);
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(4);
        listOfNumbers.add(5);
        listOfNumbers.add(6);
        listOfNumbers.add(7);
        listOfNumbers.add(8);
        listOfNumbers.add(9);
        listOfNumbers.add(10);
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(listOfNumbers);
        Assert.assertEquals(Arrays.asList(0,2,4,6,8,10),result);


    }


}
