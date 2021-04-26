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
public class DetailOrder {
    private Order order;
    private Product product;
    private int quantityOrder;
    private double price;
    private double sale;
    private double money;

    public DetailOrder() {
    }

    public DetailOrder(Order order, Product product, int quantityOrder, double price, double sale, double money) {
        this.order = order;
        this.product = product;
        this.quantityOrder = quantityOrder;
        this.price = price;
        this.sale = sale;
        this.money = money;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(int quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return order + "\t" + product + "\t" + quantityOrder + "\t" + price + "\t" + sale + "\t" + money;
    }
    
}
