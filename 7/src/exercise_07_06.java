/*
(The Sieve of Eratosthenes) The Sieve of Eratosthenes is an algorithm that finds all prime numbers up to a given limit,
n. It works by creating an array of Booleans, Flag, of size n+1, initializing the array to true (assuming every number
is a prime number in the beginning ) and iteratively traversing the numbers froms 2 to n, setting the values of indices
that are multiples of other numbers to false. Write a program using the algorithm above, and display all the prime
numbers up to 50
 */
public class exercise_07_06 {
    public static void main(String[] args) {
        final int NUM_OF_PRIMES = 51;
        // Store prime numbers
        boolean[] flag = new boolean[NUM_OF_PRIMES];
        for (int i = 0; i < NUM_OF_PRIMES; i++) {
            flag[i] = true;
        }

        System.out.println("The first 50 prime numbers are \n");

        // Travers every numbers from 2 to n
        for (int i = 2; i < NUM_OF_PRIMES; i++) {
            // If flag is true, current number (i) is a prime
            if (flag[i]) {
                System.out.println(i);
                // Setting the flag of the multiples of the current number to false
                for (int j = i+i; j < NUM_OF_PRIMES; j += i) {
                    flag[j] = false;
                }
            }
        }

    }
}
