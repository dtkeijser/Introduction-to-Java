
import java.util.Scanner;

/*
(Count the letters in a string) Write a method that counts the number of letters in
a string using the following header:
public static int countLetters(String s)
Write a test program that prompts the user to enter a string and displays the number
of letters in the string.
*/
public class exercise_6_20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = input.nextLine();


        System.out.println("The string " + s + " contains " + countLetters(s) + " letters");


    }

    //method to count letters in a string
    public static int countLetters(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++ ){
            if (Character.isLetter(s.charAt(i)))
                count++;
        }
        return count;
    }
}
