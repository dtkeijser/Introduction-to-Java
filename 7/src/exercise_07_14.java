import java.util.Scanner;

/*
(computing lcm) write a method that returns the lvm (least common multiple_ of an unspecified number of integers.
The method header is specified as follows:
public static int lcm(int ... numbers)

write a test program that prompts the user to enter five numbers, invokes the method to find the lcm
of these numbers, and displays the lcm
 */
public class exercise_07_14 {
    public static void main(String[] args){
        System.out.println("Enter five integers: ");
        Scanner input = new Scanner(System.in);

        int [] numbers = new int[5];
        //fill an array
        for (int i = 0; i <numbers.length; i++ ){
            numbers[i]= input.nextInt();
        }
        System.out.println();
        System.out.print("LCM : ");
        System.out.println(lcm(numbers));


    }

    /** Return the lcm of two integers  */
    public static int lcm(int n1, int n2) {
        // Note that computing lcm requires gcd
        return n1 * (n2 / gcd(n1, n2));
    }

    /** Return the gcd of two integers */
    public static int gcd (int n1, int n2){

        int gcd = 1; // Initial gcd is 1
        int k = 1;   // Possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++;
        }
        return gcd; // Return gcd
    }

    public static int lcm(int ... numbers){
        int lcm = numbers[0];
        // Getting the lcm of multiple numbers
        for(int i = 1; i < numbers.length; i++) {
            lcm = lcm(lcm, numbers[i]);
        }
        return lcm;
    }

}
