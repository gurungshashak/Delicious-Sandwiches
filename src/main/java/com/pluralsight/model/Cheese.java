package com.pluralsight.model;

import com.pluralsight.typeandsize.SandwichSize;

public class Cheese extends Topping{

    public Cheese(String name, boolean extra) {
        super(name, extra);
    }
    @Override
    public double getPrice(SandwichSize top) {
        double basePrice = switch (top){
            case Six -> .75;
            case Twelve -> 1.25;
        };
        if(extra)basePrice += switch (top){
            case Six -> .25;
            case Twelve -> .50;
        };
        return basePrice;
    }
}
