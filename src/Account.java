class Account {
    private String username;
    private String password;
    private double balance;
    private Transaction[] transactions = new Transaction[10]; 

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0.0;
    }
    // Getters and Setters for username, password, and balance
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    // Add Balance and Withdraw Balance methods
    public void addBalance(double amount) {
        this.balance += amount;
    }
    public void withdrawBalance(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    // Transaction methods (Create a transaction and add it to the transactions array)
    public void addTransaction(String transactionName, double transactionValue) {
        Transaction transaction = new Transaction(transactionName, transactionValue);
        
        for (int i = 0; i < 10; i++) {
            if (transactions[i] == null) {
                transactions[i] = transaction;
                break;
            }
        }
    }
    // Print the transaction history
    public void printTransactionHistory() {
        for (int i = 0; i < 10; i++) {
            if (transactions[i] != null) {
                System.out.println("Transaction Name: " + transactions[i].getTransactionName() +
                                   ", Transaction Value: " + transactions[i].getTransactionValue());
            }
        }
    }
}