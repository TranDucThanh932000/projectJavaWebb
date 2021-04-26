/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author asus
 */
public class Product {
    private String id;
    private String name;
    private double priceIN;
    private double priceOUT;
    private int quantity;
    private int type;
    private String image;

    public Product() {
    }

    public Product(String id, String name, double priceIN, double priceOUT, int quantity, int type, String image) {
        this.id = id;
        this.name = name;
        this.priceIN = priceIN;
        this.priceOUT = priceOUT;
        this.quantity = quantity;
        this.type = type;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceIN() {
        return priceIN;
    }

    public void setPriceIN(double priceIN) {
        this.priceIN = priceIN;
    }

    public double getPriceOUT() {
        return priceOUT;
    }

    public void setPriceOUT(double priceOUT) {
        this.priceOUT = priceOUT;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + priceIN + "\t" + priceOUT + "\t" + quantity + "\t" + type + "\t" + image;
    }
    
}
