package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String []args){
    SecondChallenge secondChallenge = new SecondChallenge();
    try {
        secondChallenge.probablyIWillThrowException(2,0);
        System.out.println("Done");
    }catch (Exception e){
        System.out.println("handled exception performed");
    } finally {
        System.out.println("exception handling complete");
    }
    }
}
