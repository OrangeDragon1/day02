package day2app.core;

import java.io.Console;

public class WhileLoop {   

    public static void main(String[] args) {
        
        Console cons = System.console();
        
        String input = "A";
        int operand = 0;
        int result = 0;

        while (input.length() > 0) {
            input = cons.readLine("Please enter a number. Blank to end. ");
                if (input.length() > 0) {
                operand = Integer.parseInt(input.trim());
                System.out.printf(">>> %d\n", operand);
                result += operand; }
                
        }
        System.out.printf("The sum is %d.\n", result);

        int resultTwo = 0; 
        int opnd = 0;
        String inputTwo = "";

        // controls the loop
        boolean stop = false; 

        while (!stop) {
            inputTwo = cons.readLine("Enter a number; Return to end. ");
            if (inputTwo.length() > 0) {
                opnd = Integer.parseInt(inputTwo);
                resultTwo += opnd;
            } else
                stop = true; 
        }
        System.out.printf("The sum is %d.\n", resultTwo);



    }
    
}
