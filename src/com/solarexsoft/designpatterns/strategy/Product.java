package com.solarexsoft.designpatterns.strategy;

/**
 * Created by houruhou on 03/06/2017.
 */
public class Product {
    private DiscountStrategy strategy;

    public Product(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public float getPrice(float price) {
        float discountPrice = strategy.getPrice(price);
        System.out.println(discountPrice);
        return discountPrice;
    }
}
