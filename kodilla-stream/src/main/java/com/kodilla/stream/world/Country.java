package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final String countryName;
    private final BigDecimal quantity;

    public Country(final String countryName, final BigDecimal quantity) {
        this.countryName = countryName;
        this.quantity = quantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName) && Objects.equals(quantity, country.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, quantity);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + countryName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
