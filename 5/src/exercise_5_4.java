// Write a prgram tat display the following table
/*
inches      centrimeters
1           2.54
2           5.08
....        ....
10          25.4
 */
public class exercise_5_4 {
    public static void main(String[] args) {
        System.out.println("Inches          Centimeters");
        int count = 1;

        while (count <=10){
            System.out.println(count + "\t\t\t\t" + (count*2.54));
            count++;
        }
    }
}
