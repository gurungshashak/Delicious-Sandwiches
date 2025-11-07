package com.pluralsight.model;

import com.pluralsight.typeandsize.SandwichSize;

public abstract class Topping {
    protected String name;
    protected boolean extra;

    public Topping(String name, boolean extra) {
        this.name = name;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public boolean isExtra() {
        return extra;
    }

    public abstract double getPrice(SandwichSize sandwich);

    public String toString() {
        return name + "Is Extra " ;
    }

}
