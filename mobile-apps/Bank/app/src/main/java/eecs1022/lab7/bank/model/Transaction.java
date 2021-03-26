package eecs1022.lab7.bank.model;

public class Transaction {

    private double amount;
    private String method;

    public Transaction(String method, double amount){
        this.method = method;
        this.amount = amount;
    }
    public String getStatus(){
        return("Transaction " + this.method + ": $" + this.amount);
    }

}
