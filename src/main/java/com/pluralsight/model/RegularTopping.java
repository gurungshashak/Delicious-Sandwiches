package com.pluralsight.model;


public class RegularTopping extends Topping{
    public RegularTopping(String name, boolean extra) {
        super(name, false);
    }

    @Override
    public double getPrice(String Size) {
        return 0;
    }

}
