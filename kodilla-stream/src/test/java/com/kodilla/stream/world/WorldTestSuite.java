package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorldTestSuite {

    @Test
    void peopleQuantityTest() {
        //Given
        Country country1 = new Country("Poland", new BigDecimal("40"));
        Country country2 = new Country("Germany", new BigDecimal("50"));
        List<Country> europeCountryList= new ArrayList<>();
        europeCountryList.add(country1);
        europeCountryList.add(country2);
        Continent continent1 = new Continent("Europe", europeCountryList);
        List<Continent> continentList = new ArrayList<>();
        continentList.add(continent1);
        World world = new World(continentList);
        //When
        BigDecimal peopleQuantity = world.peopleQuantity();
        //Then
        Assertions.assertEquals(new BigDecimal("90"), peopleQuantity);
    }
}
