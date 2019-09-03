public class exercise_4_6 {

/*
(Random points on a circle) Write a program that generates three random points
on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
formed by these three points, as shown in Figure 4.7a. (Hint: Generate a random
angle a in radians between 0 and 2PI, as shown in Figure 4.7b and the point determined
by this angle is (r*cos(a), r*sin(a)).)
*/
public static void main(String[] args) {


    double r = 40;

    System.out.println("Three random points are ");

    double angle = Math.random() * 360;
    double x = r * Math.cos(angle * Math.PI / 180);
    double y = r * Math.sin(angle * Math.PI / 180);
    System.out.println("(" + x + ", " + y + ")");

    angle = Math.random() * 360;
    x = r * Math.cos(angle * Math.PI / 180);
    y = r * Math.sin(angle * Math.PI / 180);
    System.out.println("(" + x + ", " + y + ")");

    angle = Math.random() * 360;
    x = r * Math.cos(angle * Math.PI / 180);
    y = r * Math.sin(angle * Math.PI / 180);
    System.out.println("(" + x + ", " + y + ")");

}
}
