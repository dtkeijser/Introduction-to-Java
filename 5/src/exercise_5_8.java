import java.util.Scanner;

/*
(Find the highest score) Write a program, that prompts the user to enter the number of students and each student name
 and score, and finally displays the name of the student with the highest score
 Use the next() method om tje Scanner class to read a name, rather than using the nextLie() method
 */
public class exercise_5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get the number of students
        System.out.println("How many students are there in the class?");
        int numberStudents = input.nextInt();

        System.out.println("Enter student name: ");
        String name1 = input.next();
        System.out.println("Enter the grade");
        int grade = input.nextInt();

        for ( int i = 1; i < numberStudents ; i++  ) {
            System.out.println("Enter student name");
            String name2 = input.next();

            System.out.println("Enter the grade");
            int grade2 = input.nextInt();

            if (grade < grade2){
                name1= name2;
            }

        }

        System.out.println("The student with the highest score is: " + name1);

    }
}
