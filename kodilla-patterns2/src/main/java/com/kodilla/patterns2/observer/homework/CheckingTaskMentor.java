package com.kodilla.patterns2.observer.homework;

public class CheckingTaskMentor implements Observer {
    private final String mentorName;
    private int updateCounty;

    public CheckingTaskMentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(SendingTaskStudent sendingTaskStudent) {
        System.out.println(getMentorName() + " :Check task " + sendingTaskStudent.getTaskName() + "\n" +
                "total: " + sendingTaskStudent.getMessage().size() + " Task done");
        updateCounty++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCounty() {
        return updateCounty;
    }
}
