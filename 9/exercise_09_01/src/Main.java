/*
(The rectangle clas) Following the example of the Circle clas in Section +9.2 design a class named Recatangle to
represent a rectangle. The class contains:
    - Two double data fields named width and height that specify the width and height of the rectangle.
    The default values are 1 for both width and height
    - A no-arg constructor that creates a default rectangle
    - a constructor that creates a rectangle with specified width and height
    - a method named getArea that returns the area of this rectangle
    - A method named getPerimeter that returns the perimeter
 */
public class Main {

    public static void main(String[] args) {
	Rectangle rectangle1 = new Rectangle();
        System.out.println("The height for rectangle 1 is " + rectangle1.height + " the width is " + rectangle1.width + " the area is " + rectangle1.getArea() +
                " and the perimeter is " + rectangle1.getPerimeter()) ;
        Rectangle rectangle2 = new Rectangle(4,40);
        System.out.println("The height for rectangle 2 is " + rectangle2.height + " the width is " + rectangle2.width + " the area is " + rectangle2.getArea() +
                " and the perimeter is " + rectangle2.getPerimeter()) ;
        Rectangle rectangle3 = new Rectangle(3.5, 35.9);
        System.out.println("The height for rectangle 3 is " + rectangle3.height + " the width is " + rectangle3.width + " the area is " + rectangle3.getArea() +
                " and the perimeter is " + rectangle3.getPerimeter()) ;
    }

}
