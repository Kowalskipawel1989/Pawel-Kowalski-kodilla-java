package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese", description);
    }
    @Test
    public void testMushroomsOrderDecoratorGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(23), theCost);
    }
    @Test
    public void testMushroomsOrderDecoratorGetDescription() {
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + mushrooms", description);
    }
    @Test
    public void testBasicPizzaOrderWithAllIngredientsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new SalamiOrderDecorator(theOrder);
        theOrder = new SausageOrderDecorator(theOrder);
        theOrder = new PrawnsOrderDecorator(theOrder);
        theOrder = new ExtraCheeseDecoration(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40), theCost);
    }
    @Test
    public void testBasicPizzaOrderWithAllIngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new SalamiOrderDecorator(theOrder);
        theOrder = new SausageOrderDecorator(theOrder);
        theOrder = new PrawnsOrderDecorator(theOrder);
        theOrder = new ExtraCheeseDecoration(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + mushrooms + salami + sausage + prawns + extra cheese", description);
    }
}
