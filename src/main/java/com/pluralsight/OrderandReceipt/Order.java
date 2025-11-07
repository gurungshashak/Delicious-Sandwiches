package com.pluralsight.OrderandReceipt;

import com.pluralsight.sandwich.Chips;
import com.pluralsight.sandwich.Drink;
import com.pluralsight.sandwich.Sandwich;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime time;
    private List<Sandwich> sandwiches= new ArrayList<Sandwich>();
    private List<Drink> drinks= new ArrayList<Drink>();
    private List<Chips> chips= new ArrayList<Chips>();

    public Order() {
        this.time = LocalDateTime.now();
    }

    public void addSandwich(Sandwich sandwich){
        this.sandwiches.add( sandwich );
    }
    public void addDrink(Drink drink){
        this.drinks.add(drink);
    }
    public void addChips(Chips chips){
        this.chips.add(chips);
    }



    public LocalDateTime getTime() {
        return time;
    }
}
