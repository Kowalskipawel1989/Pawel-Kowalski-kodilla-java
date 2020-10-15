package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.tasks.add("creating a website");
        board.inProgressList.tasks.add("software development");
        board.doneList.tasks.add("software testing");
        board.readList();
        //Then
        Assert.assertEquals(1,board.toDoList.getTasks().size());
        Assert.assertEquals(1,board.inProgressList.getTasks().size());
        Assert.assertEquals(1,board.doneList.getTasks().size());
    }
}
