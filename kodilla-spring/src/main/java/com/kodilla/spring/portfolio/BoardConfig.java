package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("task")
    TaskList taskList;

    @Bean
    public Board getBoard(){
        return new Board(getTaskListToDoList(),getTaskListInProgressList(),getTaskListToDoList());
    }
    @Bean(name = "task")
    @Scope("prototype")
    public TaskList getTaskListToDoList(){
        return new TaskList();
    }
    @Bean(name = "task")
    @Scope("prototype")
    public TaskList getTaskListInProgressList(){
        return new TaskList();
    }
    @Bean(name = "task")
    @Scope("prototype")
    public TaskList getTaskListDoneList(){
        return new TaskList();
    }
}
