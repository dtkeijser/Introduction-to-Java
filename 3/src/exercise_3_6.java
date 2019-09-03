import java.util.Scanner;
/*
Revise 3.4 bmi to let the user enter weight feet and inches.

 */
public class exercise_3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //promt the user to enter weight in pounds
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        //promt the user to enter height
        System.out.println("Enter feet");
        double feet = input.nextDouble();

        System.out.println("Enter  inches: ");
        double inch = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final  double METERS_PER_INCHE = 0.0254;
        final double INCHES_PER_FEET = 12;

        //compute BMI
        double heightInInches = (feet * 12 )+ inch;
        double weightInKIlograms = weight *KILOGRAMS_PER_POUND;
        double heightInMeters = heightInInches * METERS_PER_INCHE;
        double bmi = weightInKIlograms / ( heightInMeters*heightInMeters);

        // display results

        System.out.println("BMI is " + bmi);
        if (bmi< 18.5 )
            System.out.println("Underwieght");
        else  if (bmi <25)
            System.out.println("normal");
        else if (bmi < 30)
            System.out.println("overweight");
        else
            System.out.println("Obese");

    }
}
