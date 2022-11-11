package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithDoubleCheeseGetPrice() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new DoubleCheeseDecorator(pizza);
        //When
        BigDecimal price = pizza.getPrice();
        //Then
        assertEquals(new BigDecimal(18), price);
    }

    @Test
    public void testPizzaWithDoubleCheeseGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new DoubleCheeseDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pizza with double cheese", description);
    }

    @Test
    public void testPizzaWithWholeToppingsGetPrice() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new DoubleCheeseDecorator(pizza);
        pizza = new HamDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new ChilliPepperDecorator(pizza);
        //When
        BigDecimal price = pizza.getPrice();
        //Then
        assertEquals(new BigDecimal(28), price);
    }

    @Test
    public void testPizzaWithWholeToppingsGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new DoubleCheeseDecorator(pizza);
        pizza = new HamDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new ChilliPepperDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pizza with double cheese ham mushrooms chilli pepper", description);
    }

}
