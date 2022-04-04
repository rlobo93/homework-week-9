package HomeworkWeek09;


import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 *
 */

public class Program6RetrieveAnElement {

    public static void main(String[] args) {

    }

    public static void main(){

        List<String> colours = new ArrayList<>();

        colours.add("Pink");
        colours.add("White");
        colours.add("Orchid");
        colours.add("Black");
        colours.add("Purple");
        colours.add("Chocolate");
        colours.add("Yellow");
        colours.add("Grey");
        colours.add("Turquoise");
        colours.add("Maroon");


        System.out.println(colours);


        String element = colours.get(0);
        System.out.println("\nFirst element: " + colours);


        element = colours.get(6);
        System.out.println("Sixth element: " + element);


    }



}
