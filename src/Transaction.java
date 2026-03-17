// This class represents a transaction with a name and value.
class Transaction {
    private String transactionName;
    private double transactionValue;   

    public Transaction(String transactionName, double transactionValue) {
        this.transactionName = transactionName;
        this.transactionValue = transactionValue;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public double getTransactionValue() {
        return transactionValue;
    }
    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }
}