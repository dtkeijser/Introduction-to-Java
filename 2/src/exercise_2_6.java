import java.util.Scanner;

//Write a program that reads an integer between 0 and 1000 and multiples  all the digites in the integer.
// for example, if an integer is 932, the mulplication of all its digits is 54.
public class exercise_2_6 {

    public static void main(String[] args) {
            System.out.println("Enter a number between 0 and 1000");
    Scanner input = new Scanner(System.in);

    int number = input.nextInt();

    int lessThanTen = number % 10;
    int adjnumber = number / 10;

    int tens = adjnumber % 10;

    adjnumber =adjnumber/10;

    int hunders = adjnumber % 10;

    //number = number / 100;
    int multiplyDigits = lessThanTen * tens * hunders;
        System.out.println("The multiplication of all the digits in "+number +" is "+multiplyDigits);
}
}
