package day2app.core;

import java.util.*;

public class DataStructure {

    public static void main (String[] args) {

        // Create a list of int
        // List - generics
        List<Integer> intList = new LinkedList<Integer>();
        intList.add(Integer.parseInt("42"));
        intList.add(50);
        intList.add(19);
        intList.add(2, 30);

        System.out.println(intList);

        for (int i = 0; i < intList.size(); i++) {

            System.out.printf("%d = %d\n", i, intList.get(i));
        }


    }
    
}
