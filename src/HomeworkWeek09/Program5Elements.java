package HomeworkWeek09;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Write a Java program to iterate through all elements in an array list using Iterator.
 */


public class Program5Elements {

    public static void main(String[] args) {
        elements();
    }


    public static void elements() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);

        System.out.println("ArrayList: " + numbers);

        ListIterator<Integer> iterate = numbers.listIterator();
        System.out.println("Iterating over ArrayList");
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }


    }
}
