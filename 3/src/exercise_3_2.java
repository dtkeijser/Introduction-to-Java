import java.util.Random;
import java.util.Scanner;

/*
The program in Listing  3.1, AdditionQuiz.java generates two integers and prompts the user to enter the product of these two intergers.
revise the program to generate three single-digit integers
and prompt the user to enter the multiplication of these three integers.
 */
public class exercise_3_2 {
    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis()%10); //generate number 1
        int number2 = (int) (System.currentTimeMillis() / 10 % 10); // rand number 2
        Random rand = new Random();
        int number3 = rand.nextInt(9) +1;

        // create Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 +   " + " + number3 + " ?");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " + " +  number3 +  " = " + answer + " is "+
                (number1+ number2 + number3==answer));
    }
}
