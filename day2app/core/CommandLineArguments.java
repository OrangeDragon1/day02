package day2app.core;

public class CommandLineArguments {

    public static void main(String[] args) {

        String name = ", Who are you?";
        if (args.length > 0)
            name = args[0]; 

        else if (args.length > 2)
            name = args[1];
            
        System.out.printf("Hello %s" + "!\n", name);
            

    }


}