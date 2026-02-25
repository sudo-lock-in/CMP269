public class Exercise4 implements Runnable {
    private static long result = 0;
    @Override
    public void run() {
        for (int i = 1; i <= 1_000_000_000; i++) {
            result += i;
        }
    }
    public static void main(String[] args) {
        Exercise4 task = new Exercise4();
        Thread calculation =  new Thread(task);
        calculation.start();
        try {
            calculation.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Calculation Finished: " + result);
    }
}
