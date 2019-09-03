import java.util.Scanner;

/*
(process a string) Write a program that prompts the user to enter a string and
displays its length and its last character
 */
public class exercise_4_20 {
    public static void main(String[] args) {
        // make a scanner
        Scanner input = new Scanner(System.in);

        // prompt user input
        System.out.println("Enter a string");
        String str = input.nextLine();

        // get length of string
        int length = str.length();

        // get the last character
        char chr = str.charAt(length-1);

        System.out.println("This string is " + length + " long and the last character is " + chr);
    }
}
