package Challenge6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min =1, max=100;
        boolean isAnswer = false;

        System.out.println("Numbers Guessing Game");

        do {
            int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.printf("Is this your number %d?",randomNumber);
            String response = scanner.next();

            if (response.equals("higher")){
                min = randomNumber + 1;
            } else if (response.equals("lower")) {
                max = randomNumber - 1;
            } else if (response.equals("correct")) {
                System.out.println("I knew I would get it right!");
                isAnswer = true;
            }
        } while (!isAnswer);
    }
}
