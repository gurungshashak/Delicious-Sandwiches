package com.pluralsight.model;

public class Meat extends Topping{

    public Meat(String name, boolean extra) {
        super(name, extra);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
