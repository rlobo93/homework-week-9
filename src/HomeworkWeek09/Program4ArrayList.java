package HomeworkWeek09;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Program4ArrayList {

    public static void main(String[] args) {
        colours();
    }

    public static void colours() {

        ArrayList<String> colours = new ArrayList<>();

        colours.add("Black");
        colours.add("White");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Purple");
        colours.add("Red");
        colours.add("Pink");
        colours.add("Blue");
        colours.add("Grey");
        colours.add("Orange");
        colours.add("Silver");
        colours.add("Brown");
        colours.add("Violet");


        for (String data : colours) {
            System.out.println(data);

        }
    }

}
