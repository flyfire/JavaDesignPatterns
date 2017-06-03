package com.solarexsoft.designpatterns.strategy;

/**
 * Created by houruhou on 03/06/2017.
 */
public class ThirtyPercentOffStrategy implements DiscountStrategy {
    @Override
    public float getPrice(float price) {
        return price*0.7f;
    }
}
