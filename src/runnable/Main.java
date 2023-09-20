package runnable;

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello!" + i);
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new Runner());
        thread.start();

        System.out.println("I am go to sleep");
    }
}
