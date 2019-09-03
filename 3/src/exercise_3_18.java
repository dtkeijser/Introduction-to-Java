import java.util.Scanner;

/*
(Cost of shipping) A shipping company uses the following function to calculate
the cost (in dollars) of shipping based on the weight of the package (in
pounds).



							 2.5, if 0 < w < = 2

			     c(w) =      4.5, if 2< w < = 4

							 7.5, if 4 < w < = 10

							 10.5, if 10 < w < = 20


Write a program that prompts the user to enter the weight of the package and
display the shipping cost. If the weight is greater than 50, display a message “the
package cannot be shipped.”
*/
public class exercise_3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much does your package weight? ");

        double weight = input.nextDouble();

        if (weight<= 2)
            System.out.println("the cose for shipping is $2.5");
        else if (weight<=4)
            System.out.println("the cost for shipping is $4.5");
        else  if (weight <= 10)
            System.out.println("The cost for shipping is $7.5");
        else  if (weight <= 20 )
            System.out.println("The cost for shipping is $10.5");
        else
            System.out.println("The package cannot be shipped");

    }
}
