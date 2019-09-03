import java.util.Random;

/*
(Game: pick a card) Write a program that simulates picking a card from a deck
of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
Here is a sample run of the program:

*/
public class exercise_3_24 {
    public static void main(String[] args) {
        Random rand = new Random();

        // pick a rank
        int rank = rand.nextInt(13) +1;


        switch (rank){
            case 1:
                System.out.print("The card you picked is the Ace ");
                break;
            case 2:
                System.out.print("The card you picked is the 2 ");
                break;
            case 3:
                System.out.print("The card you picked is the 3 ");
                break;
            case 4:
                System.out.print("The card you picked is the 4 ");
                break;
            case 5:
                System.out.print("The card you picked is the 5 ");
                break;
            case 6:
                System.out.print("The card you picked is the 6 ");
                break;
            case 7:
                System.out.print("The card you picked is the 7 ");
                break;
            case 8:
                System.out.print("The card you picked is the 8 ");
                break;
            case 9:
                System.out.print("The card you picked is the 9 ");
                break;
            case 10:
                System.out.print("The card you picked is the 10 ");
                break;
            case 11:
                System.out.print("The card you picked is the Jack ");
                break;
            case 12:
                System.out.print("The card you picked is the Queen ");
                break;
            case 13:
                System.out.print("The card you picked is the King ");
                break;
        }

        int suit = rand.nextInt(4)+ 1;

        switch (suit){
            case 1:
                System.out.print("of Clubs");
                break;
            case 2:
                System.out.print("of Diamonds");
                break;
            case 3:
                System.out.print("of Hearts");
                break;
            case 4:
                System.out.print("of Spades");
                break;
        }


    }
}
