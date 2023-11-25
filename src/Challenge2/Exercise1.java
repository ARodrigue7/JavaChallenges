package Challenge2;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);

        //Question 1
        System.out.format("\nYou've lived %d years. In another %d years you'll be %d", age, age, (age * 2));
        //Question 2
        System.out.format("\nLength of name is %d", firstName.length());
    }
}
