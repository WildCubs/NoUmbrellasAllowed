package com.company;

public class Item {
    private String category;
    private String description;
    private boolean available = true;

    // getters
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public boolean isAvailable() { return available; }
            // setter
    public void toggleAvailable() { this.available = !available; }

    }

