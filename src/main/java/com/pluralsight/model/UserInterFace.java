package com.pluralsight.model;

import com.pluralsight.OrderandReceipt.Order;

import java.util.Scanner;

public class UserInterFace {
    static Scanner sc = new Scanner(System.in);
    private static Order order = new Order();

    public String userOrder(){
        while(true){
            System.out.println("====Welcome To Deli's Sand===");
            System.out.println("============================");
            System.out.println("1) \t New Order");
            System.out.println("0) \t Exit");
            System.out.print("Please enter (1 or 0): ");
            int choice = sc.nextInt();

            if(choice == 1){
                orderSandwiche();
            }else if(choice == 0){
                System.out.println("\t\tBye Bye");
                System.out.println("\t\t====================");
                sc.close();
            }
        }
    }

    private static void orderSandwiche(){
        boolean run = true;

        while(run){
            System.out.println("\n===Order Menu===");
            System.out.println("1) \t Add Sandwich");
            System.out.println("2) \t Add Drink");
            System.out.println("3) \t Add Chips");
            System.out.println("4) \t CheckOut");
            System.out.println("0) \t Cancel Order");
            System.out.print("What Would You Like(0-4): ");
            int choice = sc.nextInt();

            switch (choice){
                case 1 -> addSandwich();
                case 2 -> addDrink();
                case 3 -> addChips();
                case 4 -> checkOut();
                case 0 ->{
                    System.out.println("Order Cancelled");
                    run = false;
                }
            }

        }

    }

    private static void addSandwich(){}

    private static void addDrink(){}

    private static void addChips(){}

    private static void checkOut(){}

}
