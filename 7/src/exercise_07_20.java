import java.util.Scanner;
/*
(Descending Bubble Sort) Modify the bubble sort method of programming Exercise 7.18 and sort the elements in
the array in descending order instead of ascending order. Write a test program that reads 10 doubles
invokes the method, and displays the sorted numbers in descending order
 */
public class exercise_07_20 {
    public static void main(String[] args) {
        System.out.println("Enter five integers: ");
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
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
                if (list[j] < list[j+1]) {
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
