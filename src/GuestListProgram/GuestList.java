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
                renameGuest();
            }
            else if (option == 4) {
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
        System.out.println("3 - Rename Guest");
        System.out.println("4 - Exit");
    }
    static int getOption(){
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); //consumes next line caused by enter key when selecting option
        System.out.println();
        return option;
    }

    static void addGuest(){
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }
    }

    static void renameGuest(){
        System.out.print("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine(); //consumes new line caused by user input
        System.out.print("New name: ");
        guests[num-1] = scanner.nextLine();
    }

    static void removeGuest(){
        System.out.print("Number: ");
        int num = scanner.nextInt();
        if (num > 0 && num < guests.length && guests[num-1] != null){
            guests[num - 1] = null;
        }
        else {
            System.out.println("\nError: There is no guest with that number.");
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

