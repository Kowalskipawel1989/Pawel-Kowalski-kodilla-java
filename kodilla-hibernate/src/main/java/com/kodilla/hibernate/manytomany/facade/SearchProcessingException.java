package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception{

    public static String ERR_NOT_FOUND = "There is no match";
    public static String ERR_THREE_CHARACTERS = "Enter at least the first three letters";

    public SearchProcessingException(String message) {
        super(message);
    }
}
