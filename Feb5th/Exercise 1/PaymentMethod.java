public abstract class PaymentMethod implements Payable {
    protected String accountHolder;
    protected double balance;

    public PaymentMethod(String accountHolder, double balance) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    static int totalTransactions = 0;
    abstract void validateAccount();
   
}
