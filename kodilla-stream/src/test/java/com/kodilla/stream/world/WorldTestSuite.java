package com.kodilla.stream.world;
import org.junit.Test;


import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        Country country = new Country("Poland",new BigDecimal("38234234"));
        Country country1 = new Country("England",new BigDecimal("22092310"));
        Country country2 = new Country("Japan",new BigDecimal("8900223"));
        Country country3 = new Country("Turkey",new BigDecimal("15000231"));
        Country country4 = new Country("Argentina",new BigDecimal("17000234"));
        Country country5 = new Country("Italy",new BigDecimal("13454554"));
        Country country6 = new Country("Chine",new BigDecimal("1324000234"));
        Country country7 = new Country("Spain",new BigDecimal("22989234"));
        Country country8 = new Country("USA",new BigDecimal("168892123"));
        Country country9 = new Country("Australia",new BigDecimal("34231892"));

    }
}

