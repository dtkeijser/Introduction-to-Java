/*
(Conversion from square meter to ping) Write a prgogram that display the following
ping        square meter    |   square meter        Ping
10          33.05           |   30                  9.077
...
80          264.400         |   100                 30.257
 */
public class exercise_5_6 {
    public static void main(String[] args) {
        System.out.printf("%15s%15s    |  %15s%15s\n", "Ping", "Square meter",
                "Square meter", "Ping");
        System.out.println("--------------------------------------------------------------------");

        // Use while loop
        int ping = 10;
        int squareMeter = 30;
        int count = 0;
        while (count <= 14) {
            System.out.printf("%15d%15.3f    |  %15d%15.3f\n", ping, ping * 3.305,
                    squareMeter, squareMeter / 3.305);
            ping += 5;
            squareMeter += 5;
            count++;}
    }
}
