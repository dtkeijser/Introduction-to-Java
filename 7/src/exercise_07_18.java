import java.util.Scanner;

/*
(bubble sort) Write a sort method that uses the bubble-sort algorithm.
The bubble-sort algorithm makes several passes through the array. On each pass, successive neighboring pairs are
compared. If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. Tje technique is
called a bubble sort or sinking sort because the smaller values gradually "bubble"there way to the top
and te larger values "sink "to the bottom. Write a test program that reads in 10 double numbers, invokes the
method, and displays the sorted numbers.
 */
public class exercise_07_18 {

    public static void main(String[] args) {
        System.out.println("Enter five integers: ");
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[5];
        //fill an array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        bubbleSort(numbers);

        // print te sorted list
        System.out.println("List after sorting: ");
        printList(numbers);
    }

    static void bubbleSort(double[] list) {
        boolean changed = true;
        do {
            changed = false;
            for (int j = 0; j < list.length - 1; j++)
                if (list[j] > list[j+1]) {
                    //swap list[j] wiht list[j+1]
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    changed = true;
                }
        } while (changed);
    }

    static void printList(double[] list){
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
