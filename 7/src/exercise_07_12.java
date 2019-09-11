import java.util.Scanner;

/*
(Reverse an array) The reverse method in Section 7.7 revers an array by copying it to a new array.
Rewrite the method that reverses the array passed in the argument and returns this array.
Write a test program that prompts the user to enter 10 numbers, invokes the method to reverse the numbers, and
displays the numbers
 */
public class exercise_07_12 {
    public static void main (String[] args){
        // make array
        double [] numb = new double[10];
        //create scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter ten integers ");

        //fill array with intergers
        for (int i = 0; i <numb.length ; i++) {
            System.out.print(i + 1);
            System.out.print(". Read number : ");
            // Read a number
            numb[i] = input.nextDouble();
        }
        reverse(numb);

        System.out.println("The reversal of the input is");
        for (int i = 0; i < numb.length; i++)
            System.out.print(numb[i] + " ");

    }

    public static double[] reverse (double[] list){
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
            double temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }

        return list;
    }

}
