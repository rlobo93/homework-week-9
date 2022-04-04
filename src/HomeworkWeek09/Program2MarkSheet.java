package HomeworkWeek09;

import java.util.Scanner;

/**
 * Re write the student mark sheet programme using if else and while loop.
 *
 */
public class Program2MarkSheet {

    public static void main(String[] args) {
        main();

    }


    public static void main(){
        String result, grade = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String name = sc.next();

        System.out.print("Enter Student Roll No: ");
        int rollNum = sc.nextInt();

        System.out.print("Enter Marks for Maths: ");
        int mathsMarks = sc.nextInt();
        while (mathsMarks > 100 || mathsMarks < 0) {
            System.out.println("Invalid Input, Maths marks should be between 0 to 100");
            mathsMarks = sc.nextInt();
        }

        System.out.print("Enter Marks for Science: ");
        int scienceMarks = sc.nextInt();
        while (scienceMarks > 100 || scienceMarks < 0) {
            System.out.println("Invalid Input, Science marks should be between 0 to 100");
            scienceMarks = sc.nextInt();
        }

        System.out.print("Enter Marks for English: ");
        int englishMarks = sc.nextInt();
        while (englishMarks > 100 || englishMarks < 0) {
            System.out.println("Invalid Input, Maths marks should be between 0 to 100");
            englishMarks = sc.nextInt();
        }

        float total = mathsMarks + scienceMarks + englishMarks;
        System.out.println("Total marks for Maths + Science + English is: " + total);

        float percentage = total / 300 * 100;
        System.out.println("Percentage of all three subjects is: " + percentage);

        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        System.out.println(result);

        if (percentage >= 80) {
            grade = "A+";
            System.out.println("Grade" + grade);
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
            System.out.println("Grade: " + grade);
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
            System.out.println("Grade: " + grade);
        } else {
            grade = "";
        }
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");








    }
}
