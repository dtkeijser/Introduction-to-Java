import java.util.Random;

/*
(Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player.

*/
public class exercise_6_30 {
    public static void main(String[] args) {
        int result = rollTwoDie();
        if (result== 7 || result ==11){
            System.out.println("You win");
            System.exit(1);
        }else if (result == 2 || result == 3 || result == 12) {
            System.out.println("You lose");
            System.exit(2);
        }
        int point = result;
        System.out.println("point is " + point);
        do {
            result = rollTwoDie();
        } while (result != 7 && result != point);

        if (result == 7)
            System.out.println("You lose");
        else
            System.out.println("You win");
    }



    /** Method rollDice */
    public static int rollDice() {
        // Generate a random number between 1 to 6
        Random rand = new Random();
        int roll = rand.nextInt(6)+1;
        return roll;
    }


    //*roll two die
    public static int rollTwoDie(){
        int die1 = rollDice();
        int die2 = rollDice();
        int sum = die1 +die2;
        System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
        return sum;
    }


}
