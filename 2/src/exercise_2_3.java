import java.util.Scanner;

public class exercise_2_3 {
    // write a program that reads a number in meters, converts it to feet and displays the results
// one meter = 3.2786 feet
    public static void main(String[] args) {
        System.out.println("Enter a value for meter ");
        Scanner input = new Scanner(System.in);
        int meter = input.nextInt();
        double feet = meter * 3.2786;
        System.out.println(meter + " meters is " + feet + " feet");
    }

}
