package eecs1022.lab7.bank.model;

public class Bank {
    String status;
    int numOfClients;
    Client[] clients;

    public Bank() {
        this.status = "Accounts: {}";
        this.clients = new Client[0];
    }

    public String getStatus() {
        return status;
    }

    public String[] getStatement(String name) {
        boolean isFound = false;
        Client requiredClient = null;
        for (Client client : clients) {
            if (client.name.equals(name)) {
                isFound = true;
                requiredClient = client;
                break;
            }

        }

        if (!isFound) {
            this.status = "Error: From-Account " + name + " does not exist";
            return null;
        }
        return requiredClient.getStatement();
    }

    public void deposit(String name, double deposit) {
        boolean isFound = false;
        Client requiredClient = null;

        for (Client client : clients) {
            if (client.name.equals(name)) {
                isFound = true;
                requiredClient = client;
                break;
            }
        }

        if (!isFound) {
            this.status = "Error: To-Account " + name + " does not exist";
        } else{
            if(deposit <= 0){
                this.status = "Error: Non-Positive Amount";
                return;
            }
            requiredClient.deposit(deposit);
            this.status = "Accounts: {";

            String joined = "";
            for(int j = 0; j < clients.length;j++){
                if(j == clients.length -1){
                    joined += clients[j].getStatus();
                }else {
                    joined += clients[j].getStatus()+", ";
                }
            }
            this.status += joined+"}";
        }
    }

    public void withdraw(String name, double withdraw) {
        boolean isFound = false;
        Client requiredClient = null;

        for (Client client : clients) {
            if (client.name.equals(name)) {
                isFound = true;
                requiredClient = client;
                break;
            }
        }

        if (!isFound) {
            this.status = "Error: From-Account " + name + " does not exist";
        } else{
            if(withdraw <= 0){
                this.status ="Error: Non-Positive Amount";
                return;
            }
            if(withdraw > requiredClient.balance) {
                this.status = "Error: Amount too large to withdraw";
                return;
            }
            requiredClient.withdraw(withdraw);
            this.status = "Accounts: {";

            String joined = "";
            for(int j = 0; j < clients.length;j++){
                if(j == clients.length -1){
                    joined += clients[j].getStatus();
                }else {
                    joined += clients[j].getStatus()+", ";
                }
            }
            this.status += joined+"}";
        }
    }

    public void transfer(String from, String to, double amount) {
        boolean isFromFound = false;
        Client fromClient = null;

        for (Client client : clients) {
            if (client.name.equals(from)) {
                isFromFound = true;
                fromClient = client;
                break;
            }
        }

        Client toClient = null;
        boolean isToFound = false;
        for (Client client : clients) {
            if (client.name.equals(to)) {
                isToFound = true;
                toClient = client;
                break;
            }
        }

        if(!isFromFound){
            this.status = "Error: From-Account " + from + " does not exist";
            return;
        }

        if(!isToFound){
            this.status = "Error: To-Account " + to + " does not exist";
            return;
        }

        if(amount <= 0){
            this.status = "Error: Non-Positive Amount";
            return;
        }



        if(amount > fromClient.balance){
            this.status = "Error: Amount too large to transfer";
            return;
        }

        fromClient.withdraw(amount);
        toClient.deposit(amount);

        this.status = "Accounts: {";

        String joined = "";
        for(int j = 0; j < clients.length;j++){
            if(j == clients.length -1){
                joined += clients[j].getStatus();
            }else {
                joined += clients[j].getStatus()+", ";
            }
        }
        this.status += joined+"}";
    }

    public void addClient(String name, double deposit) {
        boolean isFound = false;
        Client requiredClient = null;

        if(clients.length == 6){
            this.status = "Error: Maximum Number of Accounts Reached";
            return;
        }

        for (Client client : clients) {
            if (client.name.equals(name)) {
                isFound = true;
                requiredClient = client;
                break;
            }
        }
        if (isFound) {
            this.status = "Error: Client "+name+" already exists";
            return;
        }

        if(deposit <= 0)
        {
            this.status = "Error: Non-Positive Initial Balance";
            return;
        }

        Client newClient = new Client(name,deposit);
        this.numOfClients += 1;

        Client[] backup = new Client[clients.length];

        for (int i = 0; i < clients.length; i++) {
            backup[i] = clients[i];
        }

        clients = new Client[this.numOfClients];

        int i;
        for (i = 0; i < backup.length; i++) {
            clients[i] = backup[i];
        }
        clients[i] = newClient;
        this.status = "Accounts: {";

        String joined = "";
        for(int j = 0; j < clients.length;j++){
            if(j == clients.length -1){
                joined += clients[j].getStatus();
            }else {
                joined += clients[j].getStatus()+", ";
            }
        }
        this.status += joined+"}";
    }
}

