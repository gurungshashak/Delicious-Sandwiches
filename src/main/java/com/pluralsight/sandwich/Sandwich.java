package com.pluralsight.sandwich;

import com.pluralsight.model.*;
import com.pluralsight.typeandsize.BreadType;
import com.pluralsight.typeandsize.SandwichSize;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private SandwichSize size;
    private BreadType bread;
    private boolean toasted;
    private List<Meat> meats = new ArrayList<Meat>();
    private List<Cheese> cheeses = new ArrayList<Cheese>();
    private List<RegularTopping> regular = new ArrayList<>();
    private List<Sauce> sauces = new ArrayList<>();

    public Sandwich(SandwichSize size, BreadType bread, boolean toasted) {
        this.size = size;
        this.bread = bread;
        this.toasted = toasted;
    }

    public void addMeat(Meat meat) {
        meats.add(meat);
    }
    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }
    public void addRegularTopping(RegularTopping regularTopping) {
        regular.add(regularTopping);
    }
    public void addSauce(Sauce sauce) {
        sauces.add(sauce);
    }

    public double sizePrice(){
        double total = switch (size){
            case Six -> 5.00;
            case Twelve -> 7.00;
        };
        for(Meat meat : meats){
            total += meat.getPrice(size);
        }
        for(Cheese cheese : cheeses){
            total += cheese.getPrice(size);
        }
        return total;
    }

    public String toString(){
        return String.format("Sandwich %s \n Meats: %s\n Cheeses: %s\n Toppings: %s\n Sauces: %s\n Price: $%.2f",
                size == SandwichSize.Six ? "6in" : size == SandwichSize.Twelve ? "FootLong": "", bread, toasted ? "Toasted" : "Not Toasted",
                meats, cheeses, regular, sauces, sizePrice() );
    }
}
