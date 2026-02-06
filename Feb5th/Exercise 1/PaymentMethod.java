public abstract class PaymentMethod implements Payable {
    protected String accountHolder;
    protected double balance;

    public PaymentMethod(String accountHolder, double balance) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    private static int totalTransactions = 0;
    abstract void validateAccount();

   public static int getTotalTransactions() {
       return totalTransactions;
   } //i had to create a getter
   
}
