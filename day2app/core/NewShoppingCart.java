package day2app.core;

import java.io.Console;
import java.util.*;

public class NewShoppingCart {

    public static void main(String[] args) {

        // things to declare
        Console cons = System.console();
        List<String> cart = new LinkedList<>();
        String input;
        boolean stop = false;
        int delIndex;

        System.out.println("Welcome to your shopping cart!");

        // main loop
        while (!stop) {
            input = cons.readLine(" > ").toLowerCase();
            String[] inputArr = input.split(" ",0);

            switch (inputArr[0]) {
                case "list":
                    if (cart.size() > 0) {
                        for (int l = 0; l < cart.size(); l++) {
                            System.out.printf("%d. %s\n", (l+1),cart.get(l));
                        }
                    } else {
                        System.out.println("Your cart is empty!");
                    }
                    break;
                
                case "add":
                    for (int a = 1; a < inputArr.length; a++)
                    if (cart.contains(inputArr[a])) {
                        System.out.printf("You have %s in your cart!\n", inputArr[a]);
                    } else {
                        cart.add(inputArr[a]);
                        System.out.printf("%s added to your cart!\n", inputArr[a]);
                    }
                    break;

                case "delete":
                    delIndex = Integer.parseInt(inputArr[1]) - 1;
                    if ((delIndex < cart.size() && (delIndex > -1))) {
                        System.out.printf("%s removed from your cart!\n", cart.get(delIndex));
                        cart.remove(delIndex);
                        } else {
                            System.err.println("Incorrect item index!");
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