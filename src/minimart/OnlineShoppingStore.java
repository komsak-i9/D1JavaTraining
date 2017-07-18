/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimart;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ARIT
 */
public class OnlineShoppingStore {
  
  ArrayList<Item> items;  
  ArrayList<Item> shoppingCart;
  
  public OnlineShoppingStore(){
      items = new ArrayList<Item>();
      items.add(new Item(1,"Clock",10));
      items.add(new Item(2,"Chair",40));
      items.add(new Item(3,"Calculator",20));  
  } 
  
  public void askCustomerToBuy(){
      System.out.println("What would you like to buy?");
  }
  
  public void getInputFromCustomer() {
      String input;
      shoppingCart = new ArrayList<Item>();
      do {
          askCustomerToBuy();
          Scanner sc = new Scanner(System.in);
          input = sc.nextLine();      
          for(Item item : items){
                if (Integer.valueOf(input) == item.id){
                    System.out.println("What Amount of "+ item.name + " ?");
                    input = sc.nextLine();
                    int amount = Integer.valueOf(input);
                    item.setQty(amount);
                    shoppingCart.add(item);
                    break;
                }
          }
          System.out.println("Do you want to continue shopping (y/n)?");
          input = sc.nextLine();
      }while(input.equalsIgnoreCase("y"));
      
      double total = 0;
      if(shoppingCart.size()> 0){
          System.out.print("Thank you for shopping, you have "+ shoppingCart.size()+ "");
          for(Item item : shoppingCart){
              System.out.println(item.id+ " " +item.name+" Amount " +item.qty );
              total += item.price * item.qty;
          }
          System.out.println("Total Amount "+ total);
      }      
  }
  
  public void showItems(){      
      for(Item s : items){
          System.out.println(s.id + " " + s.name + " " + s.price);
      }        
  }   
  
}
