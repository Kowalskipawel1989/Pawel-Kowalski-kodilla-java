package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    String taskName;
    String where;
    String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "Driving " + using +" on the " + where;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(true){
            System.out.println("Task done");
        }else{
            System.out.println("Task in progress");
        }
        return false;
    }
}
