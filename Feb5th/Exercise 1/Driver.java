import java.util.ArrayList;

public class Driver {
    public static void main(String args[]) {
       ArrayList<PaymentMethod> paymentQueue = new ArrayList<>();
       CreditCard card = new CreditCard("Arthur", 500.0, 1000.0);
       MealPlan plan = new MealPlan("Jungkook", 1000.0);
       paymentQueue.add(card);
       paymentQueue.add(plan);

       for (int i = 0; i < paymentQueue.size(); i++) {
           paymentQueue.get(i).processPayment(50.0);
       }
      System.out.println(CreditCard.getTotalTransactions());
      System.out.println(MealPlan.getTotalTransactions());
    }
}
