/*
(Estimate p) p can be computed using the following series:

m(i) = 4(1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ... + (((-1)^i + 1) / (2i - 1)))

Write a method that returns m(i) for a given i and write a test program that displays
the following table:
*/
public class exercise_6_14 {
    public static void main(String[] args) {
        System.out.println("i\t\tm(i)");
        for ( int i = 10; i <=10000; i+=10){
            System.out.println(i + "\t\t" + m(i));
        }
    }

    public static double m( int n){
        double pi= 0;
        double term ;

        for (int i=1; i <=n; i+=2){
            term = 4.0 * (1.0 / ( 2 * i -1) -1.0 / ( 2 * i + 1)  );
            pi += term;
        }
        return pi;
    }
}
