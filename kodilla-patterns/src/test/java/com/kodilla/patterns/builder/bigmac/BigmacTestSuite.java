package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBicmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame seeds")
                .ingredient("onion")
                .ingredient("lettuce")
                .ingredient("mushrooms")
                .burgers(2)
                .ingredient("cheese")
                .ingredient("prawns")
                .sauce("barbecue")
                .sauce("1000 islands")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);
    }
}
