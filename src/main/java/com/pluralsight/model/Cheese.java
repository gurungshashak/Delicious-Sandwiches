package com.pluralsight.model;

public class Cheese extends Topping{

    public Cheese(String name, boolean extra) {
        super(name, extra);
    }
    @Override
    public double getPrice(String Size) {
        double price = 0;
        switch (Size) {
            case "4" -> price = .75;
            case "8" -> price = 1.5;
            case "12" -> price = 2.25;

        }
        if (extra) {
            return switch (Size){
                case "4" -> price = .75 + .30;
                case "8" -> price = 1.5 + .60;
                case "12" -> price = 2.25 + .90;
                default -> throw new IllegalStateException("Unexpected value: " + Size);
            };
        }
        return price;
    }
}
