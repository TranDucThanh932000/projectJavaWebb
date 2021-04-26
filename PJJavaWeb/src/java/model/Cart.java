/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class Cart {
    List<Item> cart;

    public Cart() {
        cart=new ArrayList<>();
    }
    private Item getItemById(String id){
        for(Item i:cart){
            if(i.getProduct().getId().equals(id)){
                return i;
            }
        }
        return null;
    }
    public void addItem(Item t){
        if(getItemById(t.getProduct().getId())==null){
            cart.add(t);
        }else{
            Item m = getItemById(t.getProduct().getId());
            m.setQuantity(m.getQuantity()+t.getQuantity());
            if(m.getQuantity()==0){
                cart.remove(m);
            }
        }
    }
    public void deleteItem(String  id){
        if(getItemById(id)!=null){
            cart.remove(getItemById(id));
        }
    }
    public List<Item> getCart(){
        return cart;
    }
    public double getTotalMoney(){
        double t=0;
        for(Item i:cart){
            t+=(i.getProduct().getPriceOUT()*i.getQuantity());
        }
        return t;
    }
    
}
