import java.util.Scanner;

public class exercise_2_2 {
    // Write a promgram that reads in the length of sides of n equilateral traingle
// and computers the area and colume useing the following formulas
// area = sqrt3/ 4 * (lengt of sides)^2
    // volume - area * length
    public static void main(String[] args) {
        System.out.println("Enter lenght of the sides and height of the Equilateral triangle ");
        Scanner inpunt = new Scanner(System.in);
        double sides  = inpunt.nextDouble();
        double area = (Math.sqrt(3))/4*(Math.pow(sides,2));
        double volume = area * sides;
        System.out.println("The area is " + area);
        System.out.println("The colume of the Triangular prisma is: " + volume);
    }
}

