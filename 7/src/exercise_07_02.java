/*

(comparing numbers) Write a program that reads 11 intergers, compare each integer with the 11th integer, and displays
 whether the integer are "greater" , "smaller" , or equal to the 11th integer

*/
public class exercise_07_02 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] num = new int[11];

        for (int i = 0; i < 11; i++) {
            System.out.print(i + 1);
            System.out.print(". Read number : ");
            // Read a number
            num[i] = input.nextInt();
        }
        System.out.println();

        for (int i = 0; i<10 ; i++){
            if (num[i] < num[10]){
                System.out.println(num[i] + "  is smaller than " + num[10]);
            }else if (num[i] == num[10]) {
                System.out.println(num[i] + " is equal to " + num[10]);
            }else {
                System.out.println(num[i] + " is greater than " + num[10]);
            }
        }

    }
}
