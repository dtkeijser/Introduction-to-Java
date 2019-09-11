import java.util.Scanner;

/*
(count the number of vowels in a string) Write a program that prompts the user to enter a string,
and counts and displays the number of both lowercase and uppercase vowels in the string.
 */
public class exercise_07_22 {
   public static void main (String[] args){
       // create scanner
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter a line");
       String line = input.nextLine();

       // Count the number of vowels
       int count = 0;

       line = line.toLowerCase();

       for (int i = 0; i < line.length(); i++){
           char currentChar = line.charAt(i);
           // Iterate through every character, if it's a vowel, increase the count
           if ((currentChar == 'a') ||
                   (currentChar == 'e') ||
                   (currentChar == 'i') ||
                   (currentChar == 'o') ||
                   (currentChar == 'u') ) {
               count++;
           }
       }

       System.out.println("the number of vowels in the string is: " + count);



   }
}
