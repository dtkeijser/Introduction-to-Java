import java.util.Scanner;

/*
(Pattern recogination: consecutive four equal numbers) Write the following methods that test whether the array
has four consecutive numbers with the same value:
public static boolean isConsecutiveFour(int[] values)
Write a test program that prompts the user to enter a series of integers and displays it if the series contains
four consecutive numbers with the same value. Your program should first promt the user to enter the input size
-- ie the number of values in the series.
 */
public class exercise_07_30 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values ");
        int size = input.nextInt();

        int[] values = new int[size];

        System.out.print("Enter the values ");
        for (int i = 0; i <values.length; i++ ){
            values[i] = input.nextInt();
        }
        if (isConsecutiveFour(values))
            System.out.println("The series has consecutive fours");
        else
            System.out.println("The series has no consecutive fours");

    }

    public static boolean isConsecutiveFour(int[] values){
        for (int i =0; i < values.length-3; i++ ){
            boolean isEquel = true;
            for (int j=i; j<i+3; j++){
                if (values[j] != values[j+1]){
                    isEquel = false;
                    break;
                }

            }
            if (isEquel)
                return true;

        }
        return false;
    }
}
