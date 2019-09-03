import java.util.Scanner;

/*
(Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
of this program:
*/
public class exercise_3_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int numb = input.nextInt();

        boolean and = numb % 4 == 0 && numb % 5 ==0;
        boolean or =  numb % 4 == 0 || numb % 5 ==0;
        boolean andor = numb % 4 == 0 ^ numb % 5 ==0;

        System.out.println("Is " + numb + " divisible by 4 and 5? " + and);
        System.out.println("Is " + numb + " divisible by 4 or 5? " + or);
        System.out.println("Is " + numb + " divisible by 4 or 5? but not both " + andor);
    }
}
