package HomeworkWeek09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to reverse an array of integer values.
 *
 */
public class Program3ArrayOfIntegerValues {


    public static void main(String[] args) {
    Program3ArrayOfIntegerValues obj = new Program3ArrayOfIntegerValues();
    obj.main();
    }


public void main(){
        Scanner sc = new Scanner(System.in);
        int[] array1 = {10, 20, 30, 40, 50,60,70,80,90,100};
        int[] array2 = new int[array1.length];
        int j = 0;

        for (int i = 0; i < array1.length; i++) {
            array2[0 + j] = array1[array1.length - 1 - i];
            j++;
        }
        System.out.println("Reversed Array is " + Arrays.toString(array2));
    }

}
