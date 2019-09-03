
import java.util.Scanner;

/*
(Display characters) Write a method that prints characters using the following
header:

public static void printChars(int numb1, int numb2, int numberPerLine)

This method prints the characters between ch1 and ch2 with the specified numbers
per line. Write a test program that prints ten characters per line from 1 to 100.
Characters are separated by exactly one space.

*/
public class exercise_6_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int numb1 = input.nextInt();
        System.out.print("Enter second number: ");
        int numb2 = input.nextInt();
        System.out.print("Enter the amount of numbers per line: ");
        int numberPerLine = input.nextInt();

        System.out.println("The numbers from " + numb1 + " to " + numb2 + " are: ");
        printChars(numb1,numb2,numberPerLine);

    }
    /** Method printChars: Prints characters num1 and num2 with the specified
     numbers per line.                                                   */
    public static void printChars(int numb1, int numb2, int numberPerLine){
        int count = 1;
        for (int i = numb1; i <= numb2; i++, count++){
            if (count % numberPerLine ==0){
                System.out.print( count+"\n");
            }
            else System.out.print(count + " ");
        }
    }
}
