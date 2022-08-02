package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Menu {
    public static HashMap<Integer, MenuItem> menu = new HashMap<>();
    public static void main(String[] args) {
        MenuItem burger = new MenuItem(5.00, "Burger", "Delicious, juicy burger from our local sustainable beef farm", 1, 6.25);
        MenuItem caesar = new MenuItem(3.00, "Caesar Salad", "Your run of the mill, soggy crouton-filled Caesar Salad", 0, 6.29);
        MenuItem carrotCake = new MenuItem(4.50, "Carrot Cake", "A delicious, moist carrot cake with home-made cream cheese icing", 2, 7.29);
        menu.put(1, burger);
        menu.put(2, caesar);
        menu.put(3, carrotCake);

        Scanner input = new Scanner(System.in);
        System.out.println("Here is the current menu: ");
        printMenu();
        System.out.println("Would you like to add or subtract an item from the menu? \n 1 - YES \n 2 - NO");
        int answer = input.nextInt();
        input.close();
    }

    public static void addItem (double price, String name, String description, int category, double dateItemCreated){
        MenuItem newItem = new MenuItem(price, name, description, category, dateItemCreated);
        menu.put((menu.size() + 1), newItem);
    }

    public static void subtractItem (Integer choice){

    }
    public static void printMenu (){
        System.out.println("***************");
            for (Map.Entry<Integer, MenuItem> item : menu.entrySet()) {
                System.out.println(item.getKey() + ": " + "$" + item.getValue().getPrice() +
                                " - " + item.getValue().getName() + " - Category: " + item.getValue().getCategory()
                                + "\n" + item.getValue().getDescription());
            }
            System.out.println("***************");
    }

}
