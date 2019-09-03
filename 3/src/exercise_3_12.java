import java.util.Scanner;
/*
(Palindrome number) Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome number. A number is palindrome
if it reads the same from right to left and from left to right.
*/
public class exercise_3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer: ");

        int number = input.nextInt();

        int firstdigit = number /100;
        int lastDigit = number%10;

        if (firstdigit==lastDigit)
            System.out.println("This number is a palindrome");
        else
            System.out.println("This number is not a palindrome");
    }
}
