package com.pluralsight.model;

import com.pluralsight.typeandsize.SandwichSize;

public class Meat extends Topping{

    public Meat(String name, boolean extra) {
        super(name, extra);
    }

    @Override
    public double getPrice(SandwichSize pick) {
        double basePrice = switch (pick){
            case Six -> 1.50;
            case Twelve ->  3.00;
        };
        if(extra) basePrice += switch (pick){
            case Six -> .50;
            case Twelve ->  .75;
        };
        return basePrice;
    }
}
