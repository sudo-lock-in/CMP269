//Exercise 1
public class GreeterTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        GreeterTask task = new GreeterTask();
        Thread LehmanThread1 = new Thread(task, "Lehman-Thread-1");
        Thread LehmanThread2 = new Thread(task, "Lehman-Thread-2");
        LehmanThread1.start();
        LehmanThread2.start();
    }
}