import java.util.Scanner;
// Write a program that  reads the subtotal and the gratuity rate and then computes the gratuity
// and total. For example, if the user enters 10 for the subtotal and 12% for the gratuity rate, the program
// displays $1.2 as gratuity and $11.2 as total
public class exercise_2_5 {


    public static void main(String[] args) {
        System.out.println("Enter the subtotal and the gratuity rate: ");
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        int gratuityRate = input.nextInt();
        double total = subtotal+  (1+ (gratuityRate/100.0f));
        total = Math.round(total*100);
        total = total/100;

        double gratuity = total - subtotal;
        gratuity = Math.round(gratuity*100);
        gratuity = gratuity/100;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}

