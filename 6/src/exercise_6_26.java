/*
(Palindromic prime) A palindromic prime is a prime number and also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313 and
757. Write a program that displays the first 100 palindromic prime numbers. Display
10 numbers per line, separated by exactly one space, as follows:

2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
...
*/
public class exercise_6_26 {
    public static void main(String[] args) {
        int count = 1;
        for (int i  = 2; true ; i++ ){

            if (isPalindrome(i)&&isPrime(i)){
                System.out.print(i + " ");

                if (count % 10 ==0){
                    System.out.println();
                }
                if (count == 120) {
                    break;
                }
                count++;
            }

        }
    }


    // check for prime
    public static boolean isPrime(int num){
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                return false;

            }
        }
        return true;
    }
    //reverse number
    public  static int reverse( int num){
        int result = 0;
        while (num != 0){
            int lastDigit = num % 10;
            result = result*10 + lastDigit;
            num = num/10;
        }
        return result;
    }

    //check if number is palindrome
    public static boolean isPalindrome (int num){
        if (num == reverse(num)){
            return true;}
        return false;
    }
}
