import java.util.Random;

/*
(Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000 times
and display the number of winning games.
*/
public class exercise_6_32 {
    public static void main(String[] args) {
        int winCount = 0;

        for (int i = 0; i < 15000; i++) {
            int dice = rollTwoDie();
            if (dice == 7 || dice == 11) {
                winCount++;
            }
            else if (dice == 2 || dice == 3 || dice == 12) {
                //System.out.println("You lose");
            }
            else {
                int point = dice;
                //System.out.println("point is " + point);
                do {
                    dice = rollTwoDie();
                } while (dice != 7 && dice != point);

                if (dice == 7) {
                    //System.out.println("You lose");
                }
                else {
                    winCount++;
                }
            }
        }

        System.out.println(winCount);
    }

    /**play craps*/

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
