package problem2;

public class Main {
    public static void main(String[] args) {
        //testing
        Bank myBank = new Bank("Tech Bank");

        Customer customer1=new Customer("Alice");
        Customer customer2=new Customer("Bob");
        Customer customer3=new Customer("Charlie");

        myBank.addCustomer(customer1);
        myBank.addCustomer(customer2);
        myBank.addCustomer(customer3);

        myBank.addCustomerTransaction("Alice",1000.0);
        myBank.addCustomerTransaction("Alice",-150.0);

        myBank.addCustomerTransaction("Bob",500.0);
        myBank.addCustomerTransaction("Bob",200.0);
        myBank.addCustomerTransaction("Bob",-50.0);

        myBank.addCustomerTransaction("Charlie",1500.0);

        myBank.printAll();
    }
}