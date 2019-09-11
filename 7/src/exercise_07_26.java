import java.util.Scanner;

/*
(Check whether array is sorted) An array list is required to be sorted in ascending order.
Write a method that reurns ture is list is sorted, using the following header;

public static Boolean isSorted (int[] list)

write a test program that prompts the user to enter a list of integers. Note the first number in the input indicates
the number or elements in the list. This number is not part of the list
 */
public class exercise_07_26 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        // Enter values for list
        System.out.print("Enter list: ");
        int size = input.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        if (isSorted(list)) {
            System.out.println("The list is sorted");
        }
        else {
            System.out.println("The list is not sorted");
        }
    }
    public static boolean isSorted(int[] list) {
        for (int i = 1; i < list.length; i++)
            if (list[i-1] > list[i])
                return false;
        return true;
    }
}
