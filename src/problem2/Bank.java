package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name){
        this.name=name;
        this.customers=new ArrayList<>();
    }

    public void addCustomer(Customer newCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            if (newCustomer.getName().equals(this.customers.get(i).getName())) {
                return; //if the customer alredy there
            }
        }
        //if the loop showed us that he doesn't exit, we can add him
        customers.add(newCustomer);
    }

    public void addCustomerTransaction(String customerName, double amount) {
        for (int i = 0; i < customers.size(); i++) {
            if (customerName.equals(this.customers.get(i).getName())) {
                this.customers.get(i).addTransaction(amount); //Direct add
                break; //we stop, we found the customer
            }
        }
    }

    public void printAll(){
        for(int i=0;i<customers.size();i++){
            customers.get(i).printStatements();
        }
    }


}
