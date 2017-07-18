
package minimart;
public class Customer {
    public static void main(String[] args) {
        System.out.println("Test Git SVN Tool");
        OnlineShoppingStore onlineStore = new OnlineShoppingStore();
        onlineStore.showItems();
        onlineStore.askCustomerToBuy();         
        onlineStore.getInputFromCustomer();
        
    }
    
}
