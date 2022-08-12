package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTestSuite {

    @Test
    void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Onion")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        Assertions.assertEquals(3, howManyIngredients);
    }
}
