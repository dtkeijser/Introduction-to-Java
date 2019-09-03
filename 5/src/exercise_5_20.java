public class exercise_5_20 {
    /*
(display prime number between 2 and 1200) modify Listing 5.15 to display prime numbers betwee 2 and
1200. Display eight prime numbers per line. Numbers are separated by exactly one space
 */
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50; // number of primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 8;   // dispay 1- per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // a number to be tested for primeness

        System.out.println("The first 50 prime numbers are \n");

        // repeated find prime numbers
        while (number <= 1200){
            // assume the number is prime
            boolean isPrime = true; //is the current number prime?

            //Test whether number is prime
            for (int divisor = 2; divisor <= number /2 ; divisor++){
                if (number % divisor ==0) {//if true not a prime
                    isPrime = false; // Set isPrime to fals
                    break; // exit the for loop
                }
            }

            // Display the prime number and increase the count
            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    //display the number and afvance to the new line
                    System.out.println(number);
                } else System.out.print(number + " ");
            }
            //check if the next number is prime
            number++;
        }

    }
}
