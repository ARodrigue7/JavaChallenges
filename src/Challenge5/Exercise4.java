package Challenge5;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] food = new String[3];

        for(int i = 0; i < food.length; i++){
            System.out.print("Favorite food: ");
            food[i] = scanner.nextLine();
        }
        System.out.println("No more memory available.\n");
        for(String e : food){
            System.out.println(e);
        }
    }
}