package thread;

class EvenNumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Чётное число: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddNumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Нечётное число: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Task2 {
    public static void main(String[] args) {
        EvenNumberThread evenNumberThread = new EvenNumberThread();
        OddNumberThread oddNumberThread = new OddNumberThread();

        evenNumberThread.start();
        oddNumberThread.start();
    }
}
