package com.kodilla.stream.world;
import com.kodilla.stream.sand.Europe;
import org.junit.Assert;
import org.junit.Test;


import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

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
        Country country10 = new Country("Brazil",new BigDecimal("23331892"));
        Country country11 = new Country("Peru",new BigDecimal("65231892"));
        Country country12 = new Country("Canada",new BigDecimal("10231892"));
        Country country13 = new Country("Mexico",new BigDecimal("1004231892"));
        Country country14 = new Country("Ghana",new BigDecimal("9231892"));
        Country country15 = new Country("RPA",new BigDecimal("12232892"));
        Country country16 = new Country("Egypt",new BigDecimal("4231892"));
        Continent continent = new Continent("Europe");
        Continent continent1 = new Continent("Asia");
        Continent continent2 = new Continent("Australia");
        Continent continent3 = new Continent("Africa");
        Continent continent4 = new Continent("South America");
        Continent continent5 = new Continent("North America");
        //When
        world.addContinent(continent);
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);

        continent.addCountry(country);
        continent.addCountry(country1);
        continent.addCountry(country5);
        continent.addCountry(country7);
        continent1.addCountry(country2);
        continent1.addCountry(country6);
        continent2.addCountry(country9);
        continent3.addCountry(country3);
        continent3.addCountry(country16);
        continent3.addCountry(country15);
        continent3.addCountry(country14);
        continent4.addCountry(country4);
        continent4.addCountry(country11);
        continent4.addCountry(country10);
        continent5.addCountry(country12);
        continent5.addCountry(country13);
        continent5.addCountry(country8);
        //Then
        Assert.assertEquals("Europe",continent.getContinentName());
        Assert.assertEquals(BigDecimal.valueOf(22092310),country1.getQuantity());
        Assert.assertEquals(BigDecimal.valueOf(2793519513L),world.getPeopleQuantity());
    }
}

