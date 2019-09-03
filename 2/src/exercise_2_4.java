import java.util.Scanner;


//write a program that converts square meter into ping
//The program promts the user to enter a number in square meter, converts it to ping
// and displays the results. One square meter is 0.3025 ping
public class exercise_2_4 {
    public static void main(String[] args) {
        System.out.println("Enter a number in square meters: ");
        Scanner input = new Scanner(System.in);
        double squareMeter = input.nextDouble();
        double ping = squareMeter * 0.3025;
        System.out.println(squareMeter + " square meters is " + ping + " pings");
    }
}
