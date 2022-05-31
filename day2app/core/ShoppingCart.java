package day2app.core;

import java.io.Console;
import java.util.*;

public class ShoppingCart {

    public static void main (String[] args) {

        Console cons = System.console();
        boolean stop = false;
        String input;
        List<String> cart = new LinkedList<>();
        int delIndex;

        // Add test data 

        // main loop
        while (!stop) {
            input = cons.readLine("> ");
            System.out.printf("READ: %s\n", input);
            // add <list of space seperated items>
            // list
            // del 
            // end
            String[] terms = input.split(" ");

            switch (terms[0]) {

                case "add":
                    for (int t = 1; t < terms.length; t++) {
                        cart.add(terms[t]);
                    }
                    
                    break;

                case "list":
                    if (cart.size() > 0) {
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.printf("%d. %s \n", (i+1),(cart.get(i)));
                        } 
                    } else {
                        System.out.println("Your cart is empty");
                    }
                    break;

                case "del":
                if (terms.length < 2) {
                    System.err.println("Please provide an index to delete");
                } else {
                    delIndex = Integer.parseInt(terms[1]) -1;
                    if (delIndex < cart.size())
                        cart.remove(delIndex);
                        System.out.println("Deleted");
                }  

                    break;
                
                case "end":
                    stop = true;
                    break;
                
                default:
                    break;
            }
        }

    }
}