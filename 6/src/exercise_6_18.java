
import java.util.Scanner;

/*
(Check password) Some websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:

■ A password must have at least ten characters.
■ A password consists of only letters and digits.
■ A password must contain at least three digits.

Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.

*/
public class exercise_6_18 {
    public static void main(String[] args) {
        // Prompt the user to enter a password
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string for password: ");
        String s = input.nextLine();

        if (passwordDigitCheck(s) && paswordLengt(s) && passwordCharOrDig(s)){
            System.out.println("This password is valid");
        }else System.out.println("This is an invalid password");
    }

    //check lenght of password
    public static boolean paswordLengt(String password){

        return password.length() >= 10;
    }

    //check if password consists of only letters and digits
    public static boolean passwordCharOrDig ( String password){
        for (int i = 0; i < password.length(); i++){
            if (!Character.isLetterOrDigit(password.charAt(i))){
                return false;
            }

        }
        return true;
    }

    //check if password contain at least three digits
    public static boolean passwordDigitCheck (String password){
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
                numberOfDigits++;
            }
            if (numberOfDigits >=3){
                return true;
            }
        }
        return false;
    }

}
