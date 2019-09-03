import java.util.Scanner;

/*
(convert letter grade to number) Write a program that prompts the user to enter a letter grade
A,B,C,D or F and displays its corresponding numeric value 4, 3, 2, 1, or 0
For other input, display invalid grade
 */
public class exercise_4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");

        char grade = input.next().charAt(0);
        grade = Character.toLowerCase(grade);



        int value = 0;

        if (grade =='a') {
            value = 4;
        }else  if (grade =='b'){
            value = 3;
        }else if (grade == 'c'){
            value = 2;
        }else if (grade == 'd'){
            value = 1;
        }else if (grade == 'f'){
            value = 0;
        }else {
            System.out.println(grade + " is an invalid value");
        }
        System.out.println("The numeric value for " + grade + " is " + value);


    }
}
