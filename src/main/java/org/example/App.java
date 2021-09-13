/**
 * UCF COP3330 Fall 2021 Assignment 14 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        String state;
        double order,tax,total;
        final double TAXRATE = .055;

        System.out.print("What is the order amount? ");
        order = scnr.nextDouble();
        System.out.print("What is the state? ");
        state = scnr.next();

        if(state.equals("WI")) {
            tax = order * TAXRATE;
            total = tax + order;

            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.\n", order, tax, total);
            return;
        }

        System.out.printf("The total is $%.2f.\n", order);
    }
}
