package org.launchcode.java.studios.restaurantmenu;
import java.util.Date;
public class MenuItem {
    private double price;
    private String description;
    private String category;
    private String[] categories = {"Appetizer", "Main Course", "Dessert"};

    private Date dateItemCreated;
    public boolean newItem = true;
//CONSTRUCTOR
    public MenuItem(double price, String description, int category, Date dateItemCreated){
        this.price = price;
        this.description = description;
        this.category = this.categories[category];
        newItem = true;
        this.dateItemCreated = dateItemCreated;
    }
//GETTERS -----------------------------
    public double getPrice() {
        return price;
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

    public Date getDateItemCreated() {
        return dateItemCreated;
    }

    public boolean isNewItem() {
        return newItem;
    }
//SETTERS -------------------------------
    public void setPrice(double price) {
        this.price = price;
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

    public void setDateItemCreated(Date dateItemCreated) {
        this.dateItemCreated = dateItemCreated;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }
//CLASS METHODS

}
