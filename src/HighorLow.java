import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int number = random.nextInt(10)+1;
        int guess = -1;

        String trash = "";
        boolean done = false;


        do {
            System.out.printf("Enter Your Guess [1-10]: ");
                guess = in.nextInt();

                if (guess < number) {
                System.out.println("Too low, please try again");
                }
                else if (guess > number)
                {
                System.out.println("Too high, please try again");

                }
                else
                {
                System.out.println("Correct, the number was " + number);
                System.exit(0);

                }
            } while (guess!=number);





    }
}
