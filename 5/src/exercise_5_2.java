public class exercise_5_2 {
    /*
    (Repeat multiplications) Listings 5.4, SubtractionsQuizLoop generates five tandom subtractions. Revise the program
    to generate ten random multiplications question for twee integers
    between 1 and 12. Display the correct count and test time
     */
    public static void main(String[] args) {
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        java.util.Scanner input = new java.util.Scanner(System.in);
        long startTime = System.currentTimeMillis();

        while (count < 10) {
            // 1. Generate two random single-digit integers
            int number1 = 1 + (int)(Math.random() * 12);
            int number2 = 1 + (int)(Math.random() * 12);

            // 2. Prompt the student to answer "what is number1 * number2?"
            System.out.print("What is " + number1 + " * " + number2 + "? ");
            int answer = input.nextInt();

            // 3. Grade the answer and display the result
            String replyString;
            if (number1 * number2 == answer) {
                replyString = "You are correct!";
                correctCount++;
            }
            else {
                replyString = "Your answer is wrong.\n" + number1 + " * "
                        + number2 + " should be " + (number1 * number2);
            }

            System.out.println(replyString);

            // Increase the count
            count++;
        }

        System.out.println("Correct count is " + correctCount);
        long endTime = System.currentTimeMillis();
        System.out.println("Time spent is " + (endTime - startTime) / 1000 + " seconds");
    }
}
