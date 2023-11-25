package Challenge6;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] question = new String[5];
        question[0] = "Are you male? ";
        question[1] = "Do you live in the USA? ";
        question[2] = "Did you graduate college? ";
        question[3] = "Are you in the military? ";
        question[4] = "Are you working? ";

        boolean[] answers = new boolean[5];
        answers[0] = true;
        answers[1] = true;
        answers[2] = true;
        answers[3] = true;
        answers[4] = false;

        System.out.println("True or False Questions\nInput True or False to the following");
        boolean[] isTruth = new boolean[question.length];
        double count = 0;
        for (int i = 0; i < question.length; i++){
            System.out.print(question[i]);
            isTruth[i] = scanner.nextBoolean();
            if (isTruth[i] == answers[i]){
                System.out.println("Correct!");
                count++;
            }
            else {
                System.out.println("Wrong. The answer is "+answers[i]);
            }
        }
        System.out.printf("\nYour score is %.0f%%", (count/question.length)*100);
    }
}
