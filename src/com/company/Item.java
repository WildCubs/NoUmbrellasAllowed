package com.company;

public class Item {
    private String category;
    private String description;
    private boolean available = true;

    public Item (String category, String name) {
        setCategory(category);
        setDescription(name);
    }

    // getters
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public boolean isAvailable() { return available; }
            // setters
    public void toggleAvailable() { this.available = !available; }

    public void setCategory(String category) { this.category = category; }
    public void setDescription(String description) {this.description = description; }
    }

