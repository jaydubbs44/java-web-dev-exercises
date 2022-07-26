package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
public class Menu {
    public static void main(String[] args) {
        MenuItem burger = new MenuItem(5.00, "Delicious, juicy burger from our local sustainable beef farm", 1, new Date());
        MenuItem caesar = new MenuItem(3.00, "Your run of the mill, soggy crouton-filled Caesar Salad", 0, new Date());
        MenuItem carrotCake = new MenuItem(4.50, "A delicious, moist carrot cake with home-made cream cheese icing", 2, new Date());

        HashMap<Integer, MenuItem> menu = new HashMap<>();
        menu.put(1, burger);
        menu.put(2, caesar);
        menu.put(3, carrotCake);



    }

}
