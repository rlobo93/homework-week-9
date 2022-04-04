package HomeworkWeek09;

import java.util.ArrayList;

/**
 *
 * Write a Java program to test an array list is empty or not. Define array list with
 * underground tube names
 *
 */
public class Program7ArrayList {

    public static void main(String[] args) {
        list();
    }

    public static void list() {

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Is ArrayList Empty: " + list.isEmpty());
        list.add("Paddington Station");
        list.add("Ealing Broadway");
        list.add("Southall");
        list.add("Hayes & Harlington");
        list.add("West Drayton");
        list.add("Iver");
        list.add("Langley");
        list.add("Slough");


        System.out.println("Is Arraylist Empty: " + list.isEmpty());

        for (String str : list) {
            System.out.println(str);
        }


    }

}
