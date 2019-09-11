import java.util.Scanner;

/*
(Math: permutations) Write a program that prompts the user to enter four integers and then displays all possible ways
of arranging the four integers/
 */
public class exercise_07_28 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 integers: ");
        final int N = 4;
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++)
            numbers[i] = input.nextInt();

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                for (int k = 0; k < N; k++) {
                    if ((i == k) || (j == k)) continue;
                    for (int l = 0; l < N; l++) {
                        if ((i == l) || (j == l) || (k == l)) continue;
                        System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k] + " " + numbers[l]);
                        count++;
                    }
                }
            }
        }

        System.out.println("There are " + count + " possible number of ways of arranging " + N + " integers");

    }
}
