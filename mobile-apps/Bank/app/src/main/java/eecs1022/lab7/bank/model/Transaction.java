package eecs1022.lab7.bank.model;

public class Transaction {
    String transactionType;
    double amount;
    String status;

    public Transaction(){

    }

    public Transaction(String transactionType, double amount) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.status = "Transaction " + this.transactionType + ": $" + String.format("%.2f", amount);
    }

    public String getStatus() {
        return status;
    }
}

