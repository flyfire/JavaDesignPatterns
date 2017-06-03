package com.solarexsoft.designpatterns.strategy;

/**
 * Created by houruhou on 03/06/2017.
 */
public class PartlyDiscountStrategy implements DiscountStrategy {
    private float threshold = 50.0f;

    @Override
    public float getPrice(float price) {
        if (price < threshold) {
            return price;
        } else {
            return threshold + (price - threshold) * 0.8f;
        }
    }
}
