import java.util.Scanner;

/*
(Find the index of the largest element) Write a method that returns the index of the largest element in
an array of integers. If there is more than one element, return the largest index.
use the following header

public static int indexOfLargestElement (double[] array)

Write a program that prompts the user to enter 10 numbers, invoke this method to return the index of the largest element,
and display the index and the element itself
 */
public class exercise_07_10 {
    public static void main(String[] args){
        // make array
        int [] numb = new int[10];
        //create scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter ten integers ");

        //fill array with intergers
        for (int i = 0; i <numb.length ; i++) {
            numb[i] = input.nextInt();
        }


        int index = indexOfLargestElement(numb);
        System.out.println("The index of the max is " + index);
        System.out.println("The largest element is " + numb[index]);

    }

    public static int indexOfLargestElement (int[] array){
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++){
            if (max <= array[i]){
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
