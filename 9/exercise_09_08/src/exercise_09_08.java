/*
(The fan class) Design a class named Fan to represent a fan. The class contains:
-The constants named SLOW, MEdium, Fast with the values 1,2,3
-A private int data  field named speed that specifies the speed (the default is slow)
-a private boolean data field named on that specifies whether the fan is on (the default is false)
-a private double data field named radius that specifies the radius of the fan (the default is 5)
- A string data field named color that specifies the color of the fan (The default is blue)
-the accessor and mutator methods for all four data field
-a no-arg constructor that creates a default dan
-a method named toString() that returns a string description for the fan. If the fan is on. the methods returns
the fan speed color and radius in one combined string. If the fan is not on, the method returns the fan color and radius
along with the string "dan is off" in one combined string.
Write a test program that creates two fan objects. assign maximum speed  radius 10 color yellow and turn it off first object
assgign medium speed radius 5 color blue and turn it off to the second object
 */
public class exercise_09_08 {

    public static void main(String[] args) {
	Fan fan1 = new Fan();
        System.out.println("Fan 1: \n" + fan1.toString());

        Fan fan2 = new Fan(3,true, 5,"red");
        System.out.println("Fan 2: \n" + fan2.toString());

        Fan fan3 = new Fan(3,false,10,"yellow");
        System.out.println("Fan 3: \n" + fan3.toString());
    }
}
