/*
(Simulation: coupon collectors's problem) Coupon collector is a classic statistic problem with many practical
 applications.
The problem is to repeatedly pck objects fro a set of objects and find out how many pucks are needed
for all the objects to be picked atleast once. A variation of the problem
is to pick cards from a shuffeld deck of 52 cards repeatedly, and find out how many pucks are needed before you
 see one of each suit. Assume a picked card is placed back in the deck befor pucking another.
 Write a program to simulate the number of pucks needed to get four cards from each suit and display the four cards
 picked ( it is possible a card may be pucked twice)
 */
public class exercise_07_24 {
    public static void main (String[] args){
      final  int NUMBER_OF_CARDS =52;

      String [] suits = {"Clubs" , "Diamonds", "Hearts", "Spades"};
      String [] ranks = {"Ace" , "2" , "3" , "4" , "5", "6", "7" , "8", "9",
                            "10", "Jack", "Queen", "King"};

      boolean[] found = new boolean[4];

      int numberOfPicks = 0;
      int count =0;

      while (count<4){
          numberOfPicks++;
          int index = (int) (Math.random() * NUMBER_OF_CARDS);
          if (!found[index/13]){
              found[index/13] = true;
              count++;



          }
          String suit = suits[index/13];
          String rank = ranks[index%13];
          System.out.println(rank + " of " + suit );
      }
        System.out.println("number of picks: " + numberOfPicks);
    }
}
