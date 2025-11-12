package com.pluralsight.model;

import com.pluralsight.OrderandReceipt.Order;
import com.pluralsight.Product;
import com.pluralsight.sandwich.Chips;
import com.pluralsight.sandwich.Drink;
import com.pluralsight.sandwich.Sandwich;
import com.pluralsight.signature.BLT;
import com.pluralsight.signature.PhillyCheeseSteak;

import java.util.Scanner;

public class UserInterFace {
    static Scanner sc = new Scanner(System.in);
    static Order order = new Order();



    public void userOrder(){
        boolean run = true;

        while(run){
            System.out.println("====Welcome To Deli's Sand===");
            System.out.println("============================");
            System.out.println("\t1)  New Order");
            System.out.println("\t0)  Exit");
            System.out.print("Please enter (1 or 0): ");
            String choice = sc.nextLine();

           switch(choice){
               case "1":
                   orderSandwiche();
                   break;
               case "0":
                   System.out.println("\n\t\t\tBye Bye");
                   System.out.println("\t=====================");
                   run = false;
                   break;
                default:
                    System.out.println("Invalid choice");
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
            System.out.println(("5) \t Signature Sandwiches"));
            System.out.println("0) \t Cancel Order");
            System.out.print("What Would You Like(0-5): ");
            String choice = sc.nextLine();

            switch (choice){
                case "1" -> addSandwich();
                case "2" -> addDrink();
                case "3" -> addChips();
                case "4" -> checkOut();
                case "5" -> signatureSandwiches();
                case "0" ->{
                    System.out.println("Order Cancelled");
                    order.getItems().clear();
                    run = false;
                }
                default -> System.out.println("Invalid choice");
            }

        }

    }

    private static void addSandwich(){
        System.out.print("Enter Your Name: ");
        String name = sc.next();

        System.out.print("Pick A Bread (White, Wheat, Rye, Wrap): ");
        String bread = sc.next();

        System.out.print("What Size Would You Like(4, 8, 12): ");
        int size = sc.nextInt();

        Sandwich sandwich = new Sandwich(name,bread, size);

        // Meat and if extra
        System.out.println("\n\t\tAdd Meats");
        System.out.println("\t==================");
        System.out.println("\tStake \n\tHam \n\tSalami \n\tRoast Beef \n\tChicken \n\tBacon");
        System.out.print("Pick: ");
        String meat = sc.next();
        if(!meat.isBlank()){
            for (String m : meat.split(",")){
                sandwich.addMeat(m.trim());
            }
        }


        System.out.println("\n\t\tAdd Cheese");
        System.out.println("\t==================");
        System.out.println("\tAmerican \n\tProvolone \n\tCheddar \n\tSwiss");
        System.out.print("Pick: ");
        String cheese = sc.next();
        if(!cheese.isBlank()){
            for (String c : cheese.split(",")){
                sandwich.addCheese(c.trim());
            }
        }


        System.out.println("\n\t\tAdd Toppings");
        System.out.println("\t==================");
        System.out.println("\tLettuce \n\tPeppers \n\tOnions \n\tTomatoes \n\tJalapenos \n\tCucumbers \n\tPickles \n\tGuacamole \n\tMushrooms");
        System.out.print("Pick: ");
        String topping = sc.next();
        if(!topping.isBlank()){
            for (String p : topping.split(",")){
                sandwich.addTopping(p.trim());
            }
        }

        System.out.println("\n\t\tAdd Sauces");
        System.out.println("\t==================");
        System.out.println("\tMayo \n\tMustard \n\tKetchup \n\tRanch \n\tThousand islands \n\tVinaigrette");
        System.out.print("Pick: ");
        String pick = sc.next();
        if(!pick.isBlank()){
            for (String s : pick.split(",")){
                sandwich.addSauce(s.trim());
            }
        }


        System.out.print("Would You Like Extra Meat? (y/n): ");
        String extraMeat = sc.next();
        sandwich.setExtraMeat(extraMeat.equalsIgnoreCase("y"));

        System.out.print("Would You Like Extra Cheese? (y/n): ");
        String cheese2 = sc.next();
        sandwich.setExtraCheese(cheese2.equalsIgnoreCase("y"));

        System.out.print("Would You Like it Toasted? (y/n): ");
        String toasted = sc.next();
        sandwich.setToasted(toasted.equalsIgnoreCase("y"));

       order.addItem(sandwich);
       System.out.println("\n\tsandwich Ordered");


    }

    private static void addDrink(){
        System.out.print("\nSize (small, medium, large): ");
        String size = sc.next();
        System.out.print("Flavor: ");
        String flavor = sc.next();

        order.addItem(new Drink(size, flavor));
        System.out.println("\n\t\tDrink added!!");
    }

    private static void addChips(){
        System.out.print("\nType Of Chips: ");
        String type = sc.next();

        order.addItem(new Chips(type));
        System.out.println("Chips added!!");
    }

    private static void checkOut(){
        if(order.getItems().isEmpty()){
            System.out.println("You Haven't Ordered Anything!!");
            return;
        }

        System.out.println("===CHECKOUT===");
        for(Product p : order.getItems()){
            System.out.println(p.toString());
        }
        System.out.println("Total: $" + String.format("%.2f", order.getTotal()));

        System.out.print("Confirm This Is Your Order? (y/n): ");
        if(sc.next().equalsIgnoreCase("y")){
            order.saveReceipt();
            System.out.println("Order Confirmed!!");
        }else {
            System.out.println("We are Sorry");
            return;
        }
    }

    private static void signatureSandwiches(){
        System.out.println("\t1) BLt");
        System.out.println("\t2) Philly Cheese Steak");
        System.out.println("\t0) Return To The Order Menu");
        System.out.print("Choose The Signature Your Want(0-2): ");
        String choose = sc.next();

        Sandwich sandwich = null;
        switch (choose){
            case "1":
                sandwich = new BLT();
                break;
            case "2":
                sandwich = new PhillyCheeseSteak();
                break;
            case "0":
                orderSandwiche();
                break;
            default:
                System.out.println("Invalid Choice!");
        }

        System.out.print("Would You Like Like To customize It More? (y/n): ");
        String like = sc.next();
        if(like.equalsIgnoreCase("y")){
            System.out.print("Would You Like Extra Meat? (y/n): ");
            String extraMeat = sc.next();
            sandwich.setExtraMeat(extraMeat.equalsIgnoreCase("y"));

            System.out.print("Would You Like Extra Cheese? (y/n): ");
            String cheese2 = sc.next();
            sandwich.setExtraCheese(cheese2.equalsIgnoreCase("y"));

            System.out.print("Would You Like Extra Toppings? (y/n): ");
            String toppings = sc.next();
            if(toppings.equalsIgnoreCase("y")){
                System.out.println("\n\t\tAdd Toppings");
                System.out.println("\t==================");
                System.out.println("\tLettuce \n\tPeppers \n\tOnions \n\tTomatoes \n\tJalapenos \n\tCucumbers \n\tPickles \n\tGuacamole \n\tMushrooms");
                System.out.print("Pick: ");
                String topping = sc.next();
                if(!topping.isBlank()){
                    for (String p : topping.split(",")){
                        sandwich.addTopping(p.trim());
                    }
                }
            }

            System.out.println("Would You Like Extra Sauce? (y/n): ");
            String sauce = sc.next();
            if(sauce.equalsIgnoreCase("y")){
                System.out.println("\n\t\tAdd Sauces");
                System.out.println("\t==================");
                System.out.println("\tMayo \n\tMustard \n\tKetchup \n\tRanch \n\tThousand islands \n\tVinaigrette");
                System.out.print("Pick: ");
                String pick = sc.next();
                if(!pick.isBlank()){
                    for (String s : pick.split(",")){
                        sandwich.addSauce(s.trim());
                    }
                }
            }

        }
        System.out.println("Order Saved!!");
        order.addItem(sandwich);
    }

}
