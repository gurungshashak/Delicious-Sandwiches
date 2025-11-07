package com.pluralsight.model;

public class Sauce extends Topping{

    public Sauce(String name, boolean extra) {
        super(name, false);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
