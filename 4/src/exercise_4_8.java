import java.util.Scanner;

/*
(Find the character of an ASCII code) Write a program that receives Character and then displays its
ASCII code
(an integer between 0 and 127) and displays its character.
*/
public class exercise_4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char code = input.next().charAt(0);

        System.out.println("The ASCII code for character " + code + " is " + (int)code);

    }
}
