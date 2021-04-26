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
public class Account {
    private String username;
    private String password;
    private String email;
    private double cash;
    private int type;

    public Account() {
    }

    public Account(String username, String password, String email, double cash, int type) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.cash = cash;
        this.type = type;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return username + "\t" + password + "\t" + email + "\t" + cash + "\t" + type;
    }
    
}
