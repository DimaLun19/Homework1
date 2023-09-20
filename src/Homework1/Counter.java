package Homework1;
public class Counter extends Thread { // класс Counter наследуется от класса Thread
    private int count; // целочисленное поле count
    public void Increment() { // метод увеличивает значение count на 1
        count ++;
    }
    public int getValue() { // метод возвращает текущее значение count
        return count;
    }
    @Override
    public void run() { // метод вызывает метод increment() объекта Counter 1000 раз
        for (int i = 1; i <= 1000; i++) {
            Increment();
        }
    }
}