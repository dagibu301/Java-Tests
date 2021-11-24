package com.dagibu.javatests.discounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public  void total_zero_when_there_are_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();

        assertThat( priceCalculator.getTotal(), is(0.0));
    }

    @Test
    public  void total_is_the_sum_of_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.addPrice(10.2);
        priceCalculator.addPrice(25.4);


        assertThat( priceCalculator.getTotal(), is(10.2 + 25.4));
    }
}