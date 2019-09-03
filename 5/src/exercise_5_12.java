public class exercise_5_12 {
    /*
(Find the smallest n such tat n^3 < 12.000) use a while loop to find the smallest interger n
such that n^3 is greater than 12.000
 */

    public static void main(String[] args) {

        int n = 1;

        while (Math.pow(n,3) <= 12000) {

            n++;
        }
        System.out.println("The smallest n for which n^3 is 12.000 is: " + n);

    }
}
