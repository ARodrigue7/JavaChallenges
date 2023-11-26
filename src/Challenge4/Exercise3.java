package Challenge4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "shark50";
        String input;

        do {
            System.out.print("Enter password: ");
            input = scanner.next();
//            if(input.equals(password)) {
//                System.out.print("ACCESS APPROVED");
//                break;
//            }
        } while (!input.equals(password));
        System.out.print("ACCESS APPROVED");
    }
}
