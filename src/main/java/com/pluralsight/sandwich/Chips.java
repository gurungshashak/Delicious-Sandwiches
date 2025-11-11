package com.pluralsight.sandwich;

import com.pluralsight.Product;

public class Chips implements Product {
    private String chipType;

    public Chips(String chipType) {
        this.chipType = chipType;
    }

    public String getName(){
        return "Chips (" + chipType + ")";
    }

    public double getPrice() {
        return 1.50;
    }

    public String toString() {
        return chipType + "Chips: $" + String.format("%.2f", getPrice());
    }
}
