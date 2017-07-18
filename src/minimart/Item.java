/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimart;

/**
 *
 * @author ARIT
 */
public class Item {
     int id;
     String name;  
     double price;
    int qty;
    
    public Item(int id,String name,double price){
      this.id = id;
      this.name = name;
      this.price = price;
      
    }

    public void setQty(int amount) {
        this.qty = amount;        
    }
}
