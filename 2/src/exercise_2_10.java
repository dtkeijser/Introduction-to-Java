
import java.util.Scanner;

/*

(Science: calculating energy) Write a program that calculates the energy needed

to heat water from an initial temperature to a final temperature. Your program

should prompt the user to enter the amount of water in kilograms and the initial

and final temperatures of the water. The formula to compute the energy is

Q = M * (finalTemperature – initialTemperature) * 4184

where M is the weight of water in kilograms, temperatures are in degrees Celsius,

and energy Q is measured in joules.

*/
public class exercise_2_10 {

    public static void main(String[] args) {
        System.out.println("Enter the amount of water in kilograms: ");
        Scanner input = new Scanner(System.in);
        double amountWater = input.nextDouble();
        System.out.println("Enter the initial Temperature: ");
        double intTemp = input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finTemp = input.nextDouble();

        double energy = amountWater * (finTemp-intTemp) * 4184;

        System.out.println("The energy needed is: " + energy + " Q");
    }
}
