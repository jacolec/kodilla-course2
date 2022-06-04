package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public final class World {

    private final List<Continent> continentList;

    public World(final List<Continent> continentList) {
        this.continentList = continentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world = (World) o;
        return Objects.equals(continentList, world.continentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentList);
    }

    @Override
    public String toString() {
        return "World{" +
                "continentList=" + continentList +
                '}';
    }

    public BigDecimal peopleQuantity() {
        return continentList.stream()
                .flatMap(country -> country.getCountryList().stream())
                .map(people -> people.getQuantity())
                .reduce(BigDecimal.ZERO, (sum, tempQ) -> sum = sum.add(tempQ));
    }
}
