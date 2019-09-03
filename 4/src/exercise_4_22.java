import java.util.Scanner;

/*
(Check substring) Write a program that prompts the user to enter two strings
and reports whether the second string is a substring of the first string
 */
public class exercise_4_22 {
    public static void main(String[] args) {
        // make a scanner
        Scanner input = new Scanner(System.in);

        //prompt user strings
        System.out.println("Enter string s1 ");
        String s1 = input.nextLine();
        System.out.println("Enter string s2 ");
        String s2 = input.nextLine();

        //check substring and print results
        if (s1.indexOf(s2) != -1 ){
            System.out.println( s2  + " is a substring of " + s1);

        } else System.out.println(s2 + " is not a substring of " + s1);
    }
}
