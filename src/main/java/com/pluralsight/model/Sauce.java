package com.pluralsight.model;


import com.pluralsight.sandwich.Sandwich;

public class Sauce extends Topping{
    private String sauceType;


    public Sauce(String name, boolean extra, String sauceType) {
        super(name, false);
        this.sauceType = sauceType;
    }

    @Override
    public double getPrice(String Size) {
        return 0;
    }


}
