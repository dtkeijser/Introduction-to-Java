/*
(Execution time) write a program that creates an array of numbers from 1 to 100.000.000 in ascending order.
Display exectuin time of invoking the linearSearch method and the binarySearch method in Listings 7.6 and 7.7 respectively.
Display the execution time of invoking both searches for the following numbers
1; 25.000.000; 50.000.000;75.000.000;100.000.000.
You can use the following code template to obtain the execution time:
long startTime = System.naoTime();
perform the task;
long endTune = System.nanoTime();
long exectionTime = endTime - StartTime;
 */
public class exercise_07_16 {
    public static void main (String[] args){
        int[] list = new int[100000000];
        for (int i = 0; i < list.length; i++) {
            list[i] = i+1;
        }

        int key = 1;
        System.out.println("Searching for " + key + "...");
        computeTimeLinearSearch(list, key);
        computeTimeBinarySearch(list, key);
        System.out.println();

        key = 25000000;
        System.out.println("Searching for " + key + "...");
        computeTimeLinearSearch(list, key);
        computeTimeBinarySearch(list, key);
        System.out.println();

        key = 50000000;
        System.out.println("Searching for " + key + "...");
        computeTimeLinearSearch(list, key);
        computeTimeBinarySearch(list, key);
        System.out.println();

        key = 75000000;
        System.out.println("Searching for " + key + "...");
        computeTimeLinearSearch(list, key);
        computeTimeBinarySearch(list, key);
        System.out.println();

        key = 100000000;
        System.out.println("Searching for " + key + "...");
        computeTimeLinearSearch(list, key);
        computeTimeBinarySearch(list, key);
        System.out.println();



    }
    public static void computeTimeLinearSearch(int[] list, int key) {
        // Perform Linear Search and compute the time taken
        long startTime = System.nanoTime();
        System.out.println(LinearSearch.linearSearch(list, key));
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time for linear search is " +
                executionTime + " nanoseconds");
    }

    public static void computeTimeBinarySearch(int[] list, int key) {
        // Perform Binary Search and compute the time taken
        long startTime = System.nanoTime();
        System.out.println(BinarySearch.binarySearch(list, key));
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time for binary search is " +
                executionTime + " nanoseconds");
    }
}
class LinearSearch {
    /** Linear Search to find an element in an array */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i< list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}

class BinarySearch {
    /** Binary Search to find an element in an array */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;
    }
}
