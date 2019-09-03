/*
(Conversions between mile and kilometer) Write a class that contains the following two methods

 convert from mile to kilometer
 public static double mileToKilometer(double mile)

 convert from Kilometer to Mile
 public static double kilometerToMile(double kilometer)

 the formula for converion is
 1 mile = 1.6 kilometer
 */
public class exercise_6_8 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers\t|\tKilometers\t\tMiles");
        System.out.println("--------------------------------------------------------------------");

        double mile = 1;
        double kilometer = 20;
        for (int i = 1; i <= 10; mile++, kilometer += 5, i++){
            System.out.printf("%4.1f\t\t",mile);
            System.out.printf("%6.3f\t",mileToKilometer(mile));
            System.out.print("\t|\t");
            System.out.printf("%4.1f\t\t\t",kilometer);
            System.out.printf("%6.3f", kilometerToMile(kilometer));
            System.out.println();

        }
    }

    public static double mileToKilometer(double mile){
        return  1.6 * mile;

    }

    public  static  double kilometerToMile (double kilometer){
        return kilometer/1.6;
    }
}
