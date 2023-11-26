package Challenge4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;

        do {
            System.out.print("Guess a number between 1 - 100: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("HIGHER");
            }
            else if (guess > randomNumber) {
                System.out.println("LOWER");
            }
            else {
                System.out.println("CORRECT");
            }
        } while(guess != randomNumber);
    }
}
