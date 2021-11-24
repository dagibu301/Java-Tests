package com.dagibu.javatests.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();

    public void addPrice(double value) {
        prices.add(value);
    }

    public double getTotal() {

        double result = 0;

        for (Double price : prices) {
            result += price;
        }
        return result;
    }
}
