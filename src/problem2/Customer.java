package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name){
        this.name=name;
        this.transactions=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public void printStatements(){
        double balance=0;
        System.out.print("Transactions of customer "+this.name+" : ");
        for(int i=0;i<transactions.size();i++){
            System.out.print(this.transactions.get(i)+" | ");
            balance+=transactions.get(i);
        }
        System.out.println("Current balance="+balance);
    }
}
