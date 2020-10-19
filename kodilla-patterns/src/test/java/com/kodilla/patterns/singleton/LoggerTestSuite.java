package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logIn(){
        Logger.getInstance().log("logger 12.12.2019");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("logger 12.12.2019",log);
    }
}
