package Challenge3;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);

        System.out.print("Guess a number between 1 and 5: ");
        int userNumber = scanner.nextInt();

        if (userNumber == randomNumber) {
            System.out.print("Correct! Aren't you lucky.");
        }
        else {
            System.out.print("Hard luck! Maybe next time. The correct number was "+randomNumber);
        }
    }
}
