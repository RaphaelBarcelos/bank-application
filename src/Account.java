class Account {
    private String username;
    private String password;
    private double balance;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0.0;
    }

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
    
}