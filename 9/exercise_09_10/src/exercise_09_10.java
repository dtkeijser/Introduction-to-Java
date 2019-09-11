/*
(Algebra: quadratic equations) Design a class named QuadraticEquation for a quadratic equation ax^2 + bx +c
the class contains
-private data fields a,b,c that represent three coefficients
- A constructor with the arguments for a, b, c
- three getters methods for a, b, c
- A method named getDiscriminant() that returns the discriminant, which is b^2 -4ac
- The methods named getRoot1() and getRoot2() for returning two roots of the equation
    r1 = (-b + √(b^2 - 4ac)) / 2a and r2 = (-b - √(b^2 - 4ac)) / 2a
    These methods are useful only if the discriminant is nonnegative. Let these methods return 0 if the discriminant
    is negative.
    write a test program that prompts the user to enter values for a, b, and c and displays the result based on the
    discriminant. If the discriminant is positive, display the two roots. If the discriminant is 0, display the one
    root. Otherwise, display “The equation has no roots.”
    three classes a =1.0 b=3 c=1
    class2 = a = 1 b=2.0 c=1
    class3 = a=1 b=2 c=3
 */
public class exercise_09_10 {

    public static void main(String[] args) {
	QuadraticEquation quadraticEquation1 = new QuadraticEquation(1.0,3,1);
	QuadraticEquation quadraticEquation2 = new QuadraticEquation(1,2.0,1);
	QuadraticEquation quadraticEquation3 = new QuadraticEquation(1,2,3);

        System.out.println("The quadratic Equation for 1: " + quadraticEquation1.getRoot1() + " or "+ quadraticEquation1.getRoot2() );
        System.out.println("The quadratic Equation for 2: " + quadraticEquation2.getRoot1() + " or "+ quadraticEquation2.getRoot2() );
        System.out.println("The quadratic Equation for 2: " + quadraticEquation3.getRoot1() + " or "+ quadraticEquation3.getRoot2() );
    }
}
