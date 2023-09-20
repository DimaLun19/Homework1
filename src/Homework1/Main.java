package Homework1;
public class Main { // класс Main
    public static void main(String[] args) {
        Counter counter = new Counter(); // создаём counter класса Counter
        Counter counter1 = new Counter(); // создаём counter1 класса Counter
        Counter counter2 = new Counter(); // создаём counter2 класса Counter
        Counter counter3 = new Counter(); // создаём counter3 класса Counter
        counter.start(); // запускаем поток counter
        counter1.start(); // запускаем поток counter1
        System.out.println(counter.getValue() + " " + counter1.getValue());
        System.out.println(counter.getValue() + " " + counter1.getValue());
        /*
        В данном случае при первом выводе:
        1) поток counter и counter1 успевают выполнить метод increment()
           объекта Counter несколько раз, пока доходят до вывода значения
           (разные значения обусловлены разным временем на обработку программы);
        при втором выводе:
        1) после вывода подсчитанных не до конца значений потоки counter и counter1
           досчитывают их и выводят конечный результат
        */
        counter2.start(); // запускаем поток counter2
        try { // поток counter3 начнёт выполнение после того, как завершится поток counter2
            counter2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter3.start(); // запускаем поток counter3
        try { // последующий код начнёт выполнение после того, как завершатся потоки counter2 и counter3
            counter2.join();
            counter3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter2.getValue() + " " + counter3.getValue());
    }
}