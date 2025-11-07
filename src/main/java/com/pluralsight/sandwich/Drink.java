package com.pluralsight.sandwich;

import com.pluralsight.typeandsize.DrinkSize;

public class Drink {
    private DrinkSize size;
    private String flavor;

    public Drink(DrinkSize size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }
    public double getPrice() {
        return switch (size){
            case Small -> 1.00;
            case Medium -> 1.50;
            case Large -> 2.00;
        };
    }

    public String toString() {
        return size + " " + flavor + ": $" + String.format("%.2f", getPrice());
    }

}
