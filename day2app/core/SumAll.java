package day2app.core;

public class SumAll {

    public static void main(String[] args) {

    int result = 0;

        for (int i = 0; i < args.length; i++) {

            Integer value = Integer.parseInt(args[i]);
            result += value;
        }

        System.out.printf("The sum is %d.\n", result);

    }
    
}
