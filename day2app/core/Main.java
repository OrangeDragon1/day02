package day2app.core;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, World\n");

        // Instantitate the array
        String[] todos = new String[5];

        // Assigning values to the array
        todos[0] = "Learn java";
        todos[1] = "Go jogging";
        todos[2] = "Watch a movie";

        System.out.printf("Index: %d: Value = %s\n", 0, todos[0]);
        System.out.printf("Index: %d: Value = %s\n", 1, todos[1]);
        System.out.printf("Index: %d: Value = %s\n", 2, todos[2]);
        System.out.printf("Index: %d: Value = %s\n", 3, todos[3]);

        // Every array has a property called length
        System.out.printf("Size of array: %d\n", todos.length);

        System.out.printf("Index: %d: Value = %s\n", 0, args[0]);
        System.out.printf("Index: %d: Value = %s\n", 1, args[1]);
        System.out.printf("Index: %d: Value = %s\n", 2, args[2]);
        System.out.printf("Index: %d: Value = %s\n", 3, args[3]);

        System.out.printf("Size of args: %d\n", args.length);

        
    }
    
}
