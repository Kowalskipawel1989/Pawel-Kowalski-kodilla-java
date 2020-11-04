package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{
   final String taskName;
   final String whatToBuy;
   final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        return "buy: " + whatToBuy + quantity;
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
        return true;
    }
}
