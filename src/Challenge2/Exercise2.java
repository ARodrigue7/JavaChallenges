package Challenge2;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total amount of bill: ");
        double total = scanner.nextDouble();

        System.out.print("Amount of people to split with: ");
        int numberOfPeople = scanner.nextInt();

        System.out.format("The total bill is %.2f. The amount of people in the party is %d. Each person would owe: $%.2f", total, numberOfPeople, (total/numberOfPeople));
    }
}
