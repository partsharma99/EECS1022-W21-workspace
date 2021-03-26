package eecs1022.lab7.bank.model;

public class Client {
    String name;
    double balance;
    String status;
    String[] statements;
    int numOfTransactions;

    public Client(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.status = this.name + ": $" + String.format("%.2f", this.balance);
        statements = new String[1];
        statements[0] = this.status;
    }

    public String getStatus() {
        return status;
    }

    public String[] getStatement() {
        return this.statements;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        this.status = this.name + ": $" + String.format("%.2f", this.balance);
        this.numOfTransactions += 1;

        Transaction transaction = new Transaction("DEPOSIT", deposit);
        transaction.getStatus();

        String[] backUp = new String[statements.length];
        for (int i = 0; i < statements.length; i++) {
            backUp[i] = statements[i];
        }

        this.statements = new String[this.numOfTransactions + 1];
        statements[0] = status;

        int i;
        for (i = 1; i < backUp.length; i++) {
            statements[i] = backUp[i];
        }
        statements[i] = transaction.getStatus();
    }

    public void withdraw(double withdraw) {
        this.balance -= withdraw;
        this.status = this.name + ": $" + String.format("%.2f", this.balance);
        this.numOfTransactions += 1;

        Transaction transaction = new Transaction("WITHDRAW", withdraw);

        String[] backUp = new String[statements.length];
        for (int i = 0; i < statements.length; i++) {
            backUp[i] = statements[i];
        }

        this.statements = new String[this.numOfTransactions + 1];
        statements[0] = status;

        int i;
        for (i = 1; i < backUp.length; i++) {
            statements[i] = backUp[i];
        }
        statements[i] = transaction.getStatus();
    }
}

