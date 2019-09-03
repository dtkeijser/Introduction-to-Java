
import java.util.Scanner;

/*
(Display patterns) Write a method to display a pattern as follows:

1
1 2
1 2 3
.....
n n+1 n+2

the method header is
public static void displayPattern(int n)
 */
public class exercise_6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner



        // Prompt the user to enter the number of rows

        System.out.print("Enter the number of rows: ");

        int numberOfRows = input.nextInt();

        displayPattern(numberOfRows);
    }

    public  static void displayPattern(int n){
        for (int row = 1; row <= n; row++ ){
            for (int i = 1; i <=row; i++){
                System.out.print(i +" ");

            }System.out.println();
        }
    }
}
