public class exercise_5_24 {

/*
(Sum a series) Write a program to sum the following series:
1 / 3
*/
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <=97; i+=2){
            sum += (1.0 *i) /( i +2);
        }
        System.out.println("The sum is: " + sum);

    }
}
