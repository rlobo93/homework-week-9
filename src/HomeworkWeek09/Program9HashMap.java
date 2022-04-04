package HomeworkWeek09;

import java.util.HashMap;

/**
 *  Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 *
 */

public class Program9HashMap {


    public static void main(String[] args) {
        main();
    }

    public static void main() {

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("ronaldo", 1);
        people.put("john", 2);
        people.put("smith", 3);
        people.put("thomas", 4);
        people.put("william", 5);
        people.put("joseph", 6);
        people.put("paul", 7);
        people.put("alex", 8);
        people.put("jayden", 9);
        people.put("henry", 10);

        for (String i : people.keySet()) {
            System.out.println("Key: " + i + " value: " + people.get(i));
        }

    }


}
