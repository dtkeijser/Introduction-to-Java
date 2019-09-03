import java.util.Scanner;

/*
(Compute the greatest common divisor) Another solution for Listing 5.9 to find
the greatest common divisor of two integers n1 and n2 is as follows: First find d
to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
a divisor for both n1 and n2 in this order. The first such common divisor is the
greatest common divisor for n1 and n2. Write a program that prompts the user to
enter two positive integers and displays the gcd.
*/
public class exercise_5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer");
        int numb1 = input.nextInt();
        System.out.println("Enter the second integer");
        int numb2 = input.nextInt();

        // find d
        int d = ( numb1< numb2) ? numb1 : numb2;

        for (; d>=1 ;d--){
            if ((numb1 % d == 0 && numb2 % d == 0)) {
                break;
            }

        }
        System.out.println("GCD of " + numb1 + " and " + numb2 + " is "
                + d);
    }
}
