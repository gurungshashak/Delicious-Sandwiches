package com.pluralsight.model;

import com.pluralsight.typeandsize.SandwichSize;

public class Sauce extends Topping{

    public Sauce(String name, boolean extra) {
        super(name, false);
    }

    @Override
    public double getPrice(SandwichSize sandwich) {
        return 0;
    }
}
