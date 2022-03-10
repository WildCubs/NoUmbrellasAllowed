package com.company;

public class Item {
    private String category;
    private String description;
    private boolean available = true;
    private int returnPolicy;

            // getters
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public boolean isAvailable() { return available; }
    public int getReturnPolicy() { return returnPolicy; }
            // setter
    public void setAvailable() { this.available = !available; }

    }

