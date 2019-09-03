import java.util.Scanner;

// Write a program that promtps the user to enter the minutes and displays the number of years and
// remaining days. assume that a year has 365 days
public class exercise_2_7 {
    public static void main(String[] args) {
        System.out.println("Enter the number of minutes: " );
        Scanner inpute = new Scanner(System.in);
        int min = inpute.nextInt();
        // how many minutes in a year
        // year has 365 days, day 24 hours, hour 60 min
        int minperYear = 365 *24 *60;
        int years = min / minperYear;
        int days = min  % minperYear / (24*60);
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
