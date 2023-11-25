package Challenge6;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students took the exam: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];
        int sumScores = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("What was the score for Student %d:",i+1);
            scores[i] = scanner.nextInt();
        }

        System.out.println("\nExam Stats");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Score for Student %d: %d\n", i+1, scores[i]);
            sumScores += scores[i];
        }
        System.out.printf("Average score for the exam is: %d", sumScores/numStudents );
    }
}
