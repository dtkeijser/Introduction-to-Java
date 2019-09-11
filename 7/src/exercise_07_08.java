import java.util.Scanner;

/*
(Average an array) Write two overloaded methods that return the average of an array with the following headers

public static int average(int[] array)
public static fouble average(double[] array)
write a test program that prompts the user to enter 10 double values, invokes
this method, then displays the average value
 */
public class exercise_07_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double [] list = new double[10];
        System.out.print("Enter 10 double values: ");

       int i = 0;
       while (i < list.length){
           list[i] = input.nextDouble();
           i++;
       }
        System.out.println("The average value is " + average(list));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
