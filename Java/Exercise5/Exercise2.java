public class Exercise2 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Exercise2 task = new Exercise2();
        Thread stateCheck = new Thread(task);
            System.out.println(stateCheck.getState());
            stateCheck.start();
            System.out.println(stateCheck.getState());
            try {
            stateCheck.sleep(500);
            }
            catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
            System.out.println(stateCheck.getState());
        try {
            stateCheck.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(stateCheck.getState());
    }
}
