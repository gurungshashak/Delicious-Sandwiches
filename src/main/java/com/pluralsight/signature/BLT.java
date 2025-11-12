package com.pluralsight.signature;

import com.pluralsight.sandwich.Sandwich;

public class BLT extends Sandwich {

    public BLT() {
        super("BLT", "Whits", 8);
        addMeat("bacon");
        addCheese("cheddar");
        addTopping("lettuce");
        addTopping("tomato");
        addSauce("ranch");
        setToasted(true);
    }

}
