public class exercise_5_34 {
    public static void main(String[] args) {
        int count = 0;

        while (count <= 3 || count >= -3) {
            // Generate scissor, rock, paper
            int computerNumber = (int)(Math.random() * 3);

            // Prompt the user to enter scissor, rock, or paper
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("scissor (0), rock (1), paper (2): ");
            int userNumber = input.nextInt();

            // Check the guess
            switch (computerNumber) {
                case 0:
                    if (userNumber == 0) {
                        System.out.println("It is a draw");
                    }
                    else if (userNumber == 1) {
                        System.out.println("You won");
                        count++;
                    }
                    else if (userNumber == 2) {
                        System.out.println("You lost");
                        count--;
                    }
                    break;
                case 1:
                    if (userNumber == 0) {
                        System.out.println("You lost");
                        count--;
                    }
                    else if (userNumber == 1) {
                        System.out.println("It is a draw");
                    }
                    else if (userNumber == 2) {
                        System.out.println("You won");
                        count++;
                    }
                    break;
                case 2:
                    if (userNumber == 0) {
                        System.out.println("You won");
                        count++;
                    }
                    else if (userNumber == 1) {
                        System.out.println("You lost");
                        count--;
                    }
                    else if (userNumber == 2) {
                        System.out.println("It is a draw");
                    }
                    break;
            }
        }

        if (count > 3) {
            System.out.println("You won more than three times");
        }
        else {
            System.out.println("The computer won more than three times");
        }
    }
}
