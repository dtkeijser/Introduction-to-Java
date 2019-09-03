import java.util.Random;

public class exercise_5_40 {

    public static void main(String[] args) {
        int heads, tails;
        heads = tails = 0;
        Random rand = new Random();
        System.out.println("Flipping a coin a million times");
        for (int i = 0; i<=1000000;i++){
            int coin =rand.nextInt(2);
            if (coin == 0){
                tails++;
            }else heads++;

        }
        System.out.println("After a million flips the coin landed heads: " + heads + "\n and tails: " + tails + " times");
    }
}
