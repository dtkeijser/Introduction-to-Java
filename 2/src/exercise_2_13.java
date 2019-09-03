import java.util.Scanner;

/*
Suppose you save $100 each month in a savings account with annual interest rate of 3.75%
Thus, the monthly inerest rate is 0.0375/12 = 0.003125. After the first month, the value in the account becomes
100 *(1 + 0.003125) = 100.3125
after the secont moneth, the value is
(100+100.3125) * (1 + 0.003125)  = 200.938
and so on
Write a program that prompts the user to enter a monthly savings and displays the account value after the sixth month
 */
public class exercise_2_13 {
    public static void main(String[] args) {
        System.out.println("Enter the monthly saving amount ");
        Scanner input = new Scanner(System.in);
        double mounthlyAmount = input.nextDouble();

        double firstMonth = mounthlyAmount * (1 + 0.003125);

        double secondMonth = (mounthlyAmount + firstMonth) * (1 + 0.003125);

        double thirdMonth = (mounthlyAmount + secondMonth) * (1 + 0.003125);

        double fourthMonth = (mounthlyAmount + thirdMonth) * (1 + 0.003125);

        double fifthMonth = (mounthlyAmount + fourthMonth) * (1 + 0.003125);

        double sixthMonth = (mounthlyAmount + fifthMonth) * (1 + 0.003125);

        System.out.println("After the first month, the account value is: " + firstMonth);
        System.out.println("After the second month, the account value is: " + secondMonth);
        System.out.println("After the third month, the account value is: " + thirdMonth);
        System.out.println("After the sixth month, the account value is: " + sixthMonth);

    }
}
