/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoTrack;

/**
 *
 * @author glenn
 */
public class Product {
    
    private String name;
    private String category;
    private String description;
    private String ecoRating;
    private double price;

    // Constructor
    public Product(String name, String category, String description, String ecoRating, double price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.ecoRating = ecoRating;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getEcoRating() {
        return ecoRating;
    }

    public double getPrice() {
        return price;
    }
    
}
