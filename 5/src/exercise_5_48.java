import java.util.Scanner;

public class exercise_5_48 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        String evenPositions = "";	// Hold the characters at even positions

        for (int i = 1; i < string.length(); i+=2){
            evenPositions += string.charAt(i);
        }

        System.out.println(evenPositions);

    }
}
