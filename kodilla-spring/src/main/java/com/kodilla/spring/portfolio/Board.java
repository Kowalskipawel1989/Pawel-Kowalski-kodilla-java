package com.kodilla.spring.portfolio;

public class Board {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
    public void readList() {
        System.out.println("Reading: " + toDoList.getTasks());
        System.out.println("Reading: " + inProgressList.getTasks());
        System.out.println("Reading: " + doneList.getTasks());
    }
}
