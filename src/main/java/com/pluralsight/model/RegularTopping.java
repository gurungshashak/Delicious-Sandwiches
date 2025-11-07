package com.pluralsight.model;

import com.pluralsight.typeandsize.SandwichSize;

public class RegularTopping extends Topping{
    public RegularTopping(String name, boolean extra) {
        super(name, false);
    }

    @Override
    public double getPrice(SandwichSize sandwich) {
        return 0;
    }

}
