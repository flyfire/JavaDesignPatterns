package com.solarexsoft.designpatterns.strategy;

/**
 * Created by houruhou on 03/06/2017.
 */
public class App {
    public static void main(String[] args) {
        float price = 100.0f;
        Product product = new Product(new NoDiscountStrategy());
        product.getPrice(price);
        product.changeStrategy(new ThirtyPercentOffStrategy());
        product.getPrice(price);
        product.changeStrategy(new PartlyDiscountStrategy());
        product.getPrice(price);
    }
}
