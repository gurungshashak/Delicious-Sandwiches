package com.pluralsight.sandwich;

import com.pluralsight.Product;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Product {
    private String bread;
    private int size;
    private boolean toasted;
    private List<String> meats = new ArrayList<>();
    private List<String> cheeses = new ArrayList<>();
    private List<String> toppings = new ArrayList<>();
    private List<String> sauces = new ArrayList<>();
    private boolean extraMeat = false;
    private boolean extraCheese = false;

    public Sandwich(String bread, int size){
        this.bread = bread;
        this.size = size;
    }

    public void addMeat(String meat){
        this.meats.add(meat);
    }
    public void addCheese(String cheese){
        this.cheeses.add(cheese);
    }
    public void addTopping(String topping){
        this.toppings.add(topping);
    }
    public void addSauce(String sauce){
        this.sauces.add(sauce);
    }
    public void setToasted(boolean toasted){
        this.toasted = toasted;
    }
    public void setExtraMeat(boolean extraMeat){
        this.extraMeat = extraMeat;
    }
    public void setExtraCheese(boolean extraCheese){
        this.extraCheese = extraCheese;
    }

    public String getName(){
        return size + "/" + bread + "Sandwich";
    }

    public double getPrice(){
        double price = 0;
        if(size == 4){
            price = 5.50;
        }else if(size == 8){
            price = 7.00;
        }else if(size == 12){
            price = 8.50;
        }
         price += meats.size() * getMeatPrice(size);
        price += cheeses.size() * getCheesePrice(size);

        if(extraMeat){
            price += getExtraMeatPrice(size);

        }else  if(extraCheese){
            price += getExtraCheesePrice(size);
        }

        return price;
    }

    private double getMeatPrice(int size){
        return switch (size){
            case 4 -> 1.0;
            case 8 -> 2.0;
            case 12 -> 3.0;
            default -> 0;
        };
    }
    private double getCheesePrice(int size){
        return switch (size){
            case 4 -> .75;
            case 8 -> 1.50;
            case 12 -> 2.25;
            default -> 0;
        };
    }

    private double getExtraMeatPrice(int size){
        return switch (size){
            case 4 -> .50;
            case 8 -> 1.00;
            case 12 -> 1.50;
            default -> 0;
        };
    }
    private double getExtraCheesePrice(int size){
        return switch (size){
            case 4 -> .30;
            case 8 -> .60;
            case 12 -> .90;
            default -> 0;
        };
    }

    public String toString(){
        return getName() + "\n Meat: " + meats + "\n Cheeses: " + cheeses +
                "\n Toppings: " + toppings + "\n Sauses: " + sauces + "\n Extra Meat: " + extraMeat
                + "\n Extra Cheese: " + extraCheese + (toasted ? " (Toasted)" : "") +
        "\n Price: $" + String.format("%.2f", getPrice()) + "\n";
    }




}