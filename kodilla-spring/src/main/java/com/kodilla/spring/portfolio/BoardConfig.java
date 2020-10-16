package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.xml.ws.soap.Addressing;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("task1")
    TaskList taskList;

    @Bean
    public Board getBoard(){
        return new Board(getTaskListToDoList(),getTaskListInProgressList(),getTaskListToDoList());
    }
    @Bean(name = "task1")
    @Scope("prototype")
    public TaskList getTaskListToDoList(){
        return new TaskList();
    }
    @Bean(name = "task2")
    @Scope("prototype")
    public TaskList getTaskListInProgressList(){
        return new TaskList();
    }
    @Bean(name = "task3")
    @Scope("prototype")
    public TaskList getTaskListDoneList(){
        return new TaskList();
    }
}
