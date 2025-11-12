package com.pluralsight.signature;

import com.pluralsight.sandwich.Sandwich;

public class PhillyCheeseSteak extends Sandwich {

    public PhillyCheeseSteak() {
        super("Philly Cheese Stake","Whits", 8);
        addMeat("stake");
        addCheese("American");
        addTopping("peppers");
        addSauce("mayo");
        setToasted(true);
    }
}
