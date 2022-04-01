package io.codelex.assignments.restcountries;

import java.util.Currency;
import java.util.HashSet;
import java.util.Set;

public class Country {
    private final String name;
    private String capital;
    private int population;
    private double area;
    private Set<Currency> currencies = new HashSet<>();


    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Set<Currency> getCurrencies() {
        return currencies;
    }

    public void addCurrency(String code) {
        if (code.length() == 3) {
            Currency currency = Currency.getInstance(code);
            currencies.add(currency);
        }
    }

    public double getDensity() {
        if (getPopulation() != 0 && getArea() != 0) {
            return (getPopulation() / getArea());
        }
        return 0.0;
    }

}
