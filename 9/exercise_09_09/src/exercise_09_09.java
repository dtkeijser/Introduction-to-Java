
/*********************************************************************************
 * (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides   *
 * have the same length and all angles have the same degree (i.e., the polygon is *
 * both equilateral and equiangular). Design a class named RegularPolygon that    *
 * contains:                                                                      *
 *                                                                                *
 * - A private int data field named n that defines the number of sides in the     *
 *   polygon with default value 3.                                                *
 * - A private double data field named side that stores the length of the side    *
 *   with  default value 1.                                                       *
 * - A private double data field named x that defines the x-coordinate of the     *
 *   polygon’s center with default value 0.                                       *
 * - A private double data field named y that defines the y-coordinate of the     *
 *   polygon’s center with default value 0.                                       *
 * - A no-arg constructor that creates a regular polygon with default values.     *
 * - A constructor that creates a regular polygon with the specified number of    *
 *   sides  and length of side, centered at (0, 0).                               *
 * - A constructor that creates a regular polygon with the specified number of    *
 *   sides,  length of side, and x- and y-coordinates.                            *
 * - The accessor and mutator methods for all data fields.                        *
 * - The method getPerimeter() that returns the perimeter of the polygon.         *
 * - The method getArea() that returns the area of the polygon. The formula for   *
 *   computing the area of a regular polygon is Area = (n x s^2) / (4 x tan(π / n)*
 *                                                                                *
 *  Write a test program that creates three RegularPolygon objects, created       *                                                                  *
 *  using the no-arg  constructor, using RegularPolygon(6, 4), and using          *
 * c RegularPolygon(10, 4, 5.6,                                                   *
 * 7.8). For each object, display its perimeter and area.                         *

 *********************************************************************************/
public class exercise_09_09 {

    public static void main(String[] args) {
	RegularPolygon regularPolygon2 = new RegularPolygon(6 ,4);
	RegularPolygon regularPolygon1 = new RegularPolygon();
	RegularPolygon regularPolygon3 = new RegularPolygon(10,
            4,5.8,7.8);

        System.out.println("Regular polygon 1  perimeter: " + regularPolygon1.getPerimeter() + " area " + regularPolygon1.getArea() );
        System.out.println("Regular polygon 2  perimeter: " + regularPolygon2.getPerimeter() + " area " + regularPolygon2.getArea() );
        System.out.println("Regular polygon 3  perimeter: " + regularPolygon3.getPerimeter() + " area " + regularPolygon3.getArea() );

    }
}
