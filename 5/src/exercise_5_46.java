import java.util.Scanner;

public class exercise_5_46{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a String ");
            String string = input.nextLine();

            String reverse = "";

            for (int i = string.length() -1 ; i >=0 ; i--){
                reverse += string.charAt(i);
            }

            System.out.println("The reverse of " + string + " is " + reverse);


        }
}
