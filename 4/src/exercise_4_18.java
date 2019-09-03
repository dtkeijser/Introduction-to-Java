import java.util.Scanner;

/*
(Student major and status) Write a program that prompts the user to enter two characters and
displays the major and status represented in the characters. The first character indicates the major and the second is
number character 1, 2, 3, 4 which indicates whether a student is a freshman, sophomore junior or senior, Suppose
the following characters are used to denote the majors:
I : information Management
C : Computer Science
A : Accounting
 */
public class exercise_4_18 {
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // prompt user for information
        System.out.println("Enter two characters: ");
        String info = input.nextLine();

        String year ;
        String course;

        if (info.charAt(0) == 'I' || info.charAt(0) == 'i'){
            course = "Information Management";
        } else if (info.charAt(0) == 'C' || info.charAt(0) == 'c') {
            course = "Computer Science";
        } else if (info.charAt(0) == 'A' || info.charAt(0) == 'a'){
            course = "Accounting";
        } else  course = "invalid input";

        if (info.charAt(1) == '1'){
            year = "freshman";}
        else if (info.charAt(1) == '2'){
            year = "junior";
        }else if (info.charAt(1) == '3'){
            year = "sophomore";
        }else if (info.charAt(1) == '4'){
            year = "Senior";
        }else  year = "invalid input";

        System.out.println("Course: " + course + " \t" + " Year: " + year );
    }
}
