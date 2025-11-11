package com.pluralsight.sandwich;

import com.pluralsight.Product;

public class Drink implements Product {
    private String  drinkSize;
    private String flavor;

    public Drink(String drinkSize, String flavor) {
        this.drinkSize = drinkSize;
        this.flavor = flavor;
    }


    public String getName() {
        return drinkSize + " drink (" + flavor + ")";
    }

   @Override
   public double getPrice() {
        return switch (drinkSize.toLowerCase()){
            case "small" -> 1.25;
            case "medium" -> 1.75;
            case "large" -> 2.25;
            default -> 0;
        };
   }


    public String toString() {
        return getName() + "-$" + String.format("%.2f", getPrice());
    }

}
