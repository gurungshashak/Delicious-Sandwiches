package com.pluralsight.sandwich;

public class Chips {
    private String chipType;

    public Chips(String chipType) {
        this.chipType = chipType;
    }

    public double getPrice() {
        return 1.50;
    }

    public String toString() {
        return chipType + "Chips: $" + String.format("%.2f", getPrice());
    }
}
