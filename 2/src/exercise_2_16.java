import java.util.Scanner;

/*

(Geometry: area of a hexagon) Write a program that prompts the user to enter the

side of a hexagon and displays its area.
*/
public class exercise_2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the side: ");

        double side = input.nextDouble();

        double area = ((3*Math.sqrt(3))/2)*Math.pow(side,2);

        System.out.println("The area of the hexogon is: " + area);
    }
}
