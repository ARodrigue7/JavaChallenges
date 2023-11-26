package GuestListProgram;

import java.util.Scanner;

public class GuestList {
    static Scanner scanner = new Scanner(System.in);
    static String[] guests = new String[10];
    static int option;


    public static void main(String[] args) {
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";

        do {
            displayGuests();
            displayMenu();
            getOption();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.next();
                        break;
                    }
                }
            }
            else if (option == 2) {
                System.out.print("Name: ");
                String name = scanner.next();
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }
            }
            else if (option == 3) {
                System.out.println("Exiting...");
                break;
            }
        } while (true);

    }

    static void displayGuests(){
        System.out.println("_______________________\n- Guests -\n");
        for (String e : guests) {
            System.out.println(e == null ? "--" : e);
        }
    }
    static void displayMenu(){
        System.out.println("_______________________\n- Menu -\n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Exit");
    }
    static void getOption(){
        System.out.print("Option: ");
        option = scanner.nextInt();
        System.out.println();
    }

}

