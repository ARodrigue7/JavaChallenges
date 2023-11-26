package GuestListProgram;

import java.util.Scanner;

public class GuestList {
    static Scanner scanner = new Scanner(System.in);
    static String[] guests = new String[10];


    public static void main(String[] args) {

        insertTestNames();

        do {
            displayGuests();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                addGuest();
            }
            else if (option == 2) {
                removeGuest();
            }
            else if (option == 3) {
                System.out.println("Exiting...");
                break;
            }
        } while (true);

    }

    static void displayGuests(){
        System.out.println("_______________________\n- Guests -\n");
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("Guest list empty.");
        }
    }
    static void displayMenu(){
        System.out.println("_______________________\n- Menu -\n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Exit");
    }
    static int getOption(){
        System.out.print("Option: ");
        int option = scanner.nextInt();
        System.out.println();
        return option;
    }

    static void addGuest(){
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.next();
                break;
            }
        }
    }

    static void removeGuest(){
        System.out.print("Option: ");
        int input = scanner.nextInt();
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && i+1 == input) {
                guests[i] = null;
                break;
            }
        }
        String[] sortGuests = new String[guests.length];
        int sortIndex = 0;
        for (String guest : guests) {
            if (guest != null) {
                sortGuests[sortIndex] = guest;
                sortIndex++;
            }
        }
        guests = sortGuests;
    }

    static void insertTestNames(){
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";
    }

}

