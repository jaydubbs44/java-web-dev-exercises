package org.launchcode.java.studios.restaurantmenu;
import java.time.LocalDate;
import java.util.Date;
public class MenuItem {
    private double price;

    private String name;
    private String description;
    private String category;
    public static String[] categories = {"Appetizer", "Main Course", "Dessert"};

    private double dateItemCreated;
    public boolean newItem = true;
//CONSTRUCTOR
    public MenuItem(double price, String name, String description, int category, double dateItemCreated){
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = this.categories[category];
        this.newItem = true;
        this.dateItemCreated = dateItemCreated;
    }
//GETTERS -----------------------------
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String[] getCategories() {
        return categories;
    }

    public double getDateItemCreated() {
        return dateItemCreated;
    }

    public boolean isNewItem() {
        return newItem;
    }
//SETTERS -------------------------------
    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public void setDateItemCreated(double dateItemCreated) {
        this.dateItemCreated = dateItemCreated;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }
//CLASS METHODS

}
