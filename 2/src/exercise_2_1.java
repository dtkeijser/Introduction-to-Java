import java.util.Scanner;

//	write a program that reads a mile in a double value from the console, converts its to kilometers
//   and displays the results
// 1 mile = 1.6 kilometers
public class exercise_2_1 {

    public static void main(String[] args) {
        System.out.println("Enter miles: ");
        Scanner input = new Scanner(System.in);
        double miles = input.nextDouble();
        double kiloMeter = miles * 1.6;
        kiloMeter = Math.round(kiloMeter *100);
        kiloMeter = kiloMeter/100;
        System.out.println(miles + " miles is " + kiloMeter + " kilometers");
    }
}
