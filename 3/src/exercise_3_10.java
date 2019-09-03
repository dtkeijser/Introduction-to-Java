import java.util.Random;
import java.util.Scanner;

/*(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
subtraction question. Revise the program to randomly generate an addition question
with two integers less than 100.
*/
public class exercise_3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numb1 = rand.nextInt(100)+1;
        int numb2 = rand.nextInt(100)+1;

        // Prompt the user to enter an answer

        System.out.print("What is " + numb1 + " + " + numb2 + "? ");

        int answer = input.nextInt();

        if (answer== numb1+numb2){
            System.out.println("Your answer is correct");

        }else
            System.out.println("your answer is incorrect the correct anser is " + (numb1+numb2));
    }
}
