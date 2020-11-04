package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertFalse(shoppingTask.isTaskExecuted());
        Assert.assertEquals("buy: banana 3.0",shoppingTask.executeTask());
        Assert.assertEquals("Buying",shoppingTask.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertFalse(paintingTask.isTaskExecuted());
        Assert.assertEquals("Paint wall in red", paintingTask.executeTask());
        Assert.assertEquals("Painting",paintingTask.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertFalse(drivingTask.isTaskExecuted());
        Assert.assertEquals("Driving car on the street", drivingTask.executeTask());
        Assert.assertEquals("Driving", drivingTask.getTaskName());

    }
}
