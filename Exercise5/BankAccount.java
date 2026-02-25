public class BankAccount implements Runnable {
    private static int balance = 1000;
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(balance);
        }
    }

    @Override
    public void run() {
        withdraw(700);
    }
    public static void main(String[] args) {
        BankAccount task = new BankAccount();
        Thread wife = new Thread(task);
        Thread husband = new Thread(task);
        wife.start();
        husband.start();
    }

}
