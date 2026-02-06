public class MealPlan extends PaymentMethod {

    public MealPlan(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void validateAccount() {
        if (balance < 0) {
            System.out.print("Balance cannot be negative.");
        }

    }

    @Override
    public void processPayment(double amount) {
        if (balance - amount > 0) {
        balance -= amount;
        totalTransactions += 1;
        System.out.println(getPaymentStatus()); //inheritance requires me to implement this method somehow.
        } else {
            validateAccount();
        }
    }

    @Override
    public String getPaymentStatus() {
        return "Successful";
    }
}
