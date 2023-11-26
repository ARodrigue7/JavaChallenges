package Challenge4;

public class Exercise4 {
    public static void main(String[] args) {
        int i = 0;

        do {
            if (i==0){
                System.out.print(i);
            } else if (i == 10) {
                System.out.printf(", %d.",i);
            }
            else {
            System.out.printf(", %d", i);
            }
            i++;
        } while (i <= 10);

        System.out.println();

        //Clever Solution
        for (int j = 0; j <= 10; j++){
            System.out.printf("%d, ", j);
        }
        System.out.print("\b\b.");

    }
}


