package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class SendingTaskStudent implements Observable{
    private final List<Observer> observers;
    private final List<String> message;
    private final String name;

    public SendingTaskStudent (String name){
        observers = new ArrayList<>();
        message = new ArrayList<>();
        this.name = name;
    }
    public void addTask(String task) {
        message.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getMessage() {
        return message;
    }

    public String getTaskName() {
        return name;
    }
}
