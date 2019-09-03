import java.util.Scanner;

/*
(Enter three countries) Write a program that prompts the user to enter three countries and displays them in
decending order
 */
public class exercise_4_24 {
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);

        //prompt user to enter three countries
        System.out.print("Enter the first country: ");
        String country1 = input.nextLine();
        System.out.print("Enter the second country: ");
        String country2 = input.nextLine();
        System.out.print("Enter the third country: ");
        String country3 = input.nextLine();

        if (country1.compareTo(country2) > 0) {
            // swap country 1 and 2
            String temp = country1;
            country1 = country2;
            country2 = temp;
        }

        if (country2.compareTo(country3) > 0){
            String temp = country2;
            country2 = country3;
            country3 = temp;
        }
        if (country1.compareTo(country2)  > 0) {
            // swap country 1 and 2
            String temp = country1;
            country1 = country2;
            country2 = temp;
        }

        System.out.println("The three countries in descending order are " + country3 + " " + country2 + " " + country1);

    }
}
