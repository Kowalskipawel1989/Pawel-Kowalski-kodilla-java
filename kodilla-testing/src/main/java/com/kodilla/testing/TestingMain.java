package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }
        Calculator calculator = new Calculator();

        int addResult = calculator.add(500, 700);
        int subtractResult = calculator.subtract(1000, 500);
        if((addResult == 1200)&& subtractResult == 500){
            System.out.println("Test is ok");
        }else{
            System.out.println("Error");
        }
    }
}
