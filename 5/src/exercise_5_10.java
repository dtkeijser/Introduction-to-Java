public class exercise_5_10 {
    /*
( find numbers divisible by 3 and 4) Write a program that displays all the numbers form
100 to 1000, ten per line, that are divisible by 3 and 4
Number are separated by exacly one space
 */
    public static void main(String[] args) {
        int count = 1;
        for ( int i = 100; i <= 1000 ; i++){
            if (i %3 == 0 || i % 4 ==0) {
                System.out.println((count++ % 10 != 0) ? i + " ": i + "\n");
            }
        }
    }
}
