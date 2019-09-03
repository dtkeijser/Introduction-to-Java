
/*
(Mersenne prime) A prime number is called a Mersenne prime if it can be written
in the form 2p - 1 for some positive integer p. Write a program that finds all
Mersenne primes with p <= 31 and displays the output as follows:
p             2^p –1
-----------------------
2             3
3             7
5             31
...

*/
public class exercise_6_28 {
    public static void main(String[] args) {


        for (int p = 2; p <= 31; p++) {
            int i = (int) (Math.pow(2, p) - 1);

            // Display each number in five positions
            if (isPrime(i)) {
                System.out.println(p + "\t" + i);
            }
        }



    }

    public static boolean isPrime(int num) {


        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
