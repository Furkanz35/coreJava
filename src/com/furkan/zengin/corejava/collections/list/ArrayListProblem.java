package com.furkan.zengin.corejava.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome the GroceryList program");
        System.out.println("----------------------");

        while (true) {
            System.out.println("Please select the option: ");
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list (coma delimited list");
            System.out.println("2 - to remove any item(s) to list (coma delimited list");
            try {
                int selection = Integer.parseInt(scanner.nextLine());
                if( selection == 0)
                    Domain.shutdown();
                System.out.println("Please enter items");
                String inp = scanner.nextLine();
                String [] items = inp.split(",");

                if (selection == 1)
                    Domain.addItemtoGroceryList(items);
                else if (selection == 2) {
                    Domain.removeItemFromGroceryList(items);
                }
                else
                    break;
            }
            catch (NumberFormatException e) {
                System.out.println("You should enter a numerical input");
            }

        }

    }

}

class Domain {

    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void shutdown(){
        System.exit(0);
    }

    public static void addItemtoGroceryList(String [] items) {
        for(String c : items) {
            if(!groceryList.contains(c))
                groceryList.add(c);
            else {
                System.out.println(c + " is already added!!!");

            }

        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Adding process completed, list: ");
        System.out.println(groceryList);
    }

    public static void removeItemFromGroceryList(String [] items) {
        for(String s : items)
            groceryList.remove(s);
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Deleting process completed, list: ");
        System.out.println(groceryList);
    }

    public static void displayList() {
        System.out.println("List :");
        System.out.println(groceryList);
    }


}
