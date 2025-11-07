package com.pluralsight.model;

public class Cheese extends Topping{

    public Cheese(String name, boolean extra) {
        super(name, extra);
    }
    @Override
    public double getPrice() {

        return 0;
    }
}
