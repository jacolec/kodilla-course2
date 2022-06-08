package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {

   private final String continentName;
   private final List<Country> countryList;

    public Continent(final String continentName, final List<Country> countryList) {
        this.continentName = continentName;
        this.countryList = countryList;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName) && Objects.equals(countryList, continent.countryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName, countryList);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countryList=" + countryList +
                '}';
    }
}
