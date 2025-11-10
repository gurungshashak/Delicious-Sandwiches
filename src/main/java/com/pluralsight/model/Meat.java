package com.pluralsight.model;


import com.pluralsight.sandwich.Sandwich;

public class Meat extends Topping{

    public Meat(String name, boolean extra, Sandwich sandwich) {
        super(name, extra);
    }


    @Override
    public double getPrice(String Size) {
        double price = 0;
        switch (Size) {
            case "4" -> price = 1.00;
            case "8" -> price = 2.00;
            case "12" -> price = 3.00;

        }
        if (extra) {
            return switch (Size){
                case "4" -> price = 1.00 + .50;
                case "8" -> price = 2.00 + 1.00;
                case "12" -> price = 3.00 + 1.50;
                default -> throw new IllegalStateException("Unexpected value: " + Size);
            };
        }
        return price;

    }
}
