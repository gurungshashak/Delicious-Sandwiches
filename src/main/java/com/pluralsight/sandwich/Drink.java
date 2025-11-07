package com.pluralsight.sandwich;

import com.pluralsight.typeandsize.DrinkSize;

import java.util.Scanner;

public class Drink {
    private DrinkSize size;
    private String flavor;

    public Drink(DrinkSize size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

}
