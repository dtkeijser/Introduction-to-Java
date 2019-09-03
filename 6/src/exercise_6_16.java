/*
(Number of days in a year) Write a method that returns the number of days in a
year using the following header:
public static int numberOfDaysInAYear(int year)
Write a test program that displays the number of days in year from 2014 to 2034.
*/
public class exercise_6_16 {

    public static void main(String[] args) {
        for (int year = 2014; year <= 2034; year++) {
            System.out.println(year + " has " + numberOfDaysInAYear(year));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if (leapYear(year)) {
            return 366;
        }
        else {
            return 365;
        }
    }

    /** Determine if it is a leap year */
    static boolean leapYear (int year){
        if (year % 4 == 0)
            return true;
        else if ( year % 100 == 0)
            return  false;
        else if (year % 400 == 0)
            return true;
        else return false;
    }

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
