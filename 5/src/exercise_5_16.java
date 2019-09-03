
import java.util.Scanner;

/*
(Find the factors of an integer) Write a program that reads an integer and
displays all its smallest factors in an increasing order.
For an example, if the input integer is 120, the output should be as follows: 2,2,2,3,5
 */
public class exercise_5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer ");
        int numb = input.nextInt();

        // Find all the smallest factors of the integer
        System.out.print("The factors for " + numb + " is ");
        int factor = 2;
        while (factor<=numb){
            if (numb % factor == 0) {
                numb = numb / factor;
                System.out.print(factor + " ");
            }
            else {
                factor++;
            }
        }
        System.out.println();

    }
}
