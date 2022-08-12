package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigMacTestSuite {

    @Test
    void testBigMacBuilder() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredients("onion")
                .ingredients("cucumber")
                .ingredients("chilli")
                .build();
        System.out.println(bigMac);
        //When
        int ingredientsAmount = bigMac.getIngredients().size();
        int burgersAmount = bigMac.getBurgers();
        //Then
        Assertions.assertEquals(3, ingredientsAmount);
        Assertions.assertEquals(2, burgersAmount);

    }
}
