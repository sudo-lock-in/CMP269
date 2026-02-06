public class CreditCard extends PaymentMethod {
    private double creditLimit;

    public CreditCard(String accountHolder, double balance, double creditLimit) {
        super(accountHolder, balance);
        this.creditLimit = creditLimit;

    }

   @Override
   public void processPayment(double amount) {
       if (amount > balance + creditLimit) {
           System.out.println(getPaymentStatus()); //required to use this method for the inheritance
       } else {
           balance -= amount;
           validateAccount(); //required to use this method for the inheritance
       }
   }

    @Override
    public String getPaymentStatus() {
        return "Transaction Declined.";
    }

    @Override
    void validateAccount() {
        totalTransactions += 1;
    }

}
