package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    int idNumber;
    String userName;
    char sex;
    LocalDate dateOfBirth;
    int numberOfPostsPublished;

    public ForumUser(int idNumber, String userName, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int numberOfPostsPublished) {
        this.idNumber = idNumber;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPostsPublished = numberOfPostsPublished;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public String getUserName() {
        return userName;
    }
    public char getSex() {
        return sex;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public int getNumberOfPostsPublished() {
        return numberOfPostsPublished;
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber= " + idNumber +
                ", userName= '" + userName + '\'' +
                ", sex= " + sex +
                ", dateOfBirth= " + dateOfBirth +
                ", numberOfPostsPublished= " + numberOfPostsPublished +
                '}';
    }
    public int hashCode(){
        return dateOfBirth.getYear();
    }
}


