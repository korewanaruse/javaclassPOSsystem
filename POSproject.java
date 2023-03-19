package com.mycompany.POS;

import java.util.Scanner;
public class POSproject {

    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,payment;
    public static void menu() {
        System.out.println("\t\t\t\t+==================================+");
        System.out.println("\t\t\t\t            CAFE BISTRO             ");
        System.out.println("\t\t\t\t                                    ");
        System.out.println("\t\t\t\t   1. Coffee             Php 120.00 ");
        System.out.println("\t\t\t\t   2. Milktea            Php 115.00 ");
        System.out.println("\t\t\t\t   3. Cake               Php  75.00 ");
        System.out.println("\t\t\t\t   4. Muffins            Php  50.00 ");
        System.out.println("\t\t\t\t   5. Water              Php  20.00 ");
        System.out.println("\t\t\t\t+==================================+");
    }
    /**
     * 
     */
    public static void order() {
    System.out.print("Press 1 to order Coffee.");
    System.out.print("\t\tPress 2 to order Milktea.");
    System.out.print("\t\tPress 3 to order Cake.");
    System.out.print("\t\tPress 4 to order Muffins.");
    System.out.print("\t\tPress 5 to order Water.");
    System.out.print("\t\t\t\t Choose the number of the item you wish to purchase:   ");
    choose = input.nextInt();
    
    // PURCHASE CONDITIONS

    // COFFEE
    if (choose == 1) {
        System.out.println("You chose Coffee.");
        System.out.print("How many Coffees do you want to purchase?");
        quantity = input.nextInt();
        double subtotal = quantity * 120;
        total += subtotal;
        System.out.println("Do you want to purchase again?");
        System.out.println("Press Y for Yes and N for No.");
        again = input.next();
        if (again.equalsIgnoreCase("Y")) {
            order(); // Call the method you to create
        } else {
            System.out.println("The total price is: " + total);
            double pay = 0;
            do {
                System.out.println("Enter the amount to pay: ");
                pay = input.nextDouble();
                if (pay < total) {
                    System.out.println("Not enough, the total amount is " + total);
                }
            } while (pay < total);
            double change = pay - total;
            System.out.println("Thank you for your purchase! Your change is: " + change);
        }
    }
    
    // MILKTEA
    if(choose == 2) {
        System.out.println("You chose Milktea.");
        System.out.print("How many Milktea do you want to purchase?");
        quantity = input.nextInt();
        double subtotal = quantity * 115;
        total += subtotal;
        System.out.println("Do you want to purchase again?");
        System.out.println("Press Y for Yes and N for No.");
        again = input.next();
        if (again.equalsIgnoreCase("Y")) {
            order(); // Call the method you to create
        } else {
            System.out.println("The total price is: " + total);
            double pay = 0;
            do {
                System.out.println("Enter the amount to pay: ");
                pay = input.nextDouble();
                if (pay < total) {
                    System.out.println("Not enough, the total amount is " + total);
                }
            } while (pay < total);
            double change = pay - total;
            System.out.println("Thank you for your purchase! Your change is: " + change);
            }
        }
    
    // CAKE
    if (choose == 3){
        System.out.println("You chose Cake.");
        System.out.print("How many Cakes do you want to purchase?");
        quantity = input.nextInt();
        double subtotal = quantity * 75;
        total += subtotal;
        System.out.println("Do you want to purchase again?");
        System.out.println("Press Y for Yes and N for No.");
        again = input.next();
        if (again.equalsIgnoreCase("Y")) {
            order(); // Call the method you to create
        } else {
            System.out.println("The total price is: " + total);
            double pay = 0;
            do {
                System.out.println("Enter the amount to pay: ");
                pay = input.nextDouble();
                if (pay < total) {
                    System.out.println("Not enough, the total amount is " + total);
                }
            } while (pay < total);
            double change = pay - total;
            System.out.println("Thank you for your purchase! Your change is: " + change);
            }
        }

    // MUFFINS
    if(choose == 4) {
        System.out.println("You chose Muffins.");
        System.out.print("How many Muffins do you want to purchase?");
        quantity = input.nextInt();
        double subtotal = quantity * 50;
        total += subtotal;
        System.out.println("Do you want to purchase again?");
        System.out.println("Press Y for Yes and N for No.");
        again = input.next();
        if (again.equalsIgnoreCase("Y")) {
            order(); // Call the method you to create
        } else {
            System.out.println("The total price is: " + total);
            double pay = 0;
            do {
                System.out.println("Enter the amount to pay: ");
                pay = input.nextDouble();
                if (pay < total) {
                    System.out.println("Not enough, the total amount is " + total);
                }
            } while (pay < total);
            double change = pay - total;
            System.out.println("Thank you for your purchase! Your change is: " + change);
            }
        }
        
    // WATER
    if(choose == 5) {
        System.out.println("You chose Water.");
        System.out.print("How many Water do you want to purchase?");
        quantity = input.nextInt();
        double subtotal = quantity * 20;
        total += subtotal;
        System.out.println("Do you want to purchase again?");
        System.out.println("Press Y for Yes and N for No.");
        again = input.next();
        if (again.equalsIgnoreCase("Y")) {
            order(); // Call the method you to create
        } else {
            System.out.println("The total price is: " + total);
            double pay = 0;
            do {
                System.out.println("Enter the amount to pay: ");
                pay = input.nextDouble();
                if (pay < total) {
                    System.out.println("Not enough, the total amount is " + total);
                }
            } while (pay < total);
            double change = pay - total;
            System.out.println("Thank you for your purchase! Your change is: " + change);
                }
            }

    }  {
        extracted(); // CLOSE THE PROGRAM
        System.out.println("Choose 1 to 5 only!");
        order ();
    }
    private void extracted() {
        System.exit(0);
    }
    public static void main(String[] args) {
        // OPEN THE MENU
        menu(); 
        order(); 
    }

}   