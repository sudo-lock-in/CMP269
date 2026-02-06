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
   } //i had to make private & create a getter & setter (add function)

   public static void addTotalTransactions() {
       PaymentMethod.totalTransactions += 1;
   }
   
}
