package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckingTaskMentorJavaTestSuite {
    @Test
    public void updateTest() {
        //Given
        SendingTaskStudent studentPython = new StudentPython();
        SendingTaskStudent studentJava = new StudentJava();
        CheckingTaskMentor johnSmith = new CheckingTaskMentor("John Smith");
        CheckingTaskMentor jackTaylor = new CheckingTaskMentor("Jack Taylor");
        studentJava.registerObserver(jackTaylor);
        studentPython.registerObserver(johnSmith);
        //When
        studentJava.addTask("Task 1.1");
        studentPython.addTask("Task 2.3");
        studentJava.addTask("Task 1.2");
        //Then
        assertEquals(1, johnSmith.getUpdateCounty());
        assertEquals(2, jackTaylor.getUpdateCounty());
    }
}
