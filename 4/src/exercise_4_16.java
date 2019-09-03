public class exercise_4_16 {
    /*
(Random character) Write a program that displays a random lowercase letter ussing
the Math.random() method.
 */
    public static void main(String[] args) {
        char ch = (char)(Math.random() * 26 + 'a');
        System.out.println("A random lowercase letter is " + ch);
    }
}
