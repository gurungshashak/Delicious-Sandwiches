package com.pluralsight.sandwich;



public class Drink {
    private String  drinkSize;
    private String flavor;


    public double getPrice(String drinkSize){

        return switch (drinkSize){
            case "small" -> 1.25;
            case "medium" -> 1.75;
            case "learge" -> 2.25;
            default -> throw new IllegalStateException("Unexpected value: " + drinkSize);
        };
    }
    public String toString() {
        return drinkSize + flavor + ": $" + String.format("%.2f", getPrice(drinkSize));
    }

}
