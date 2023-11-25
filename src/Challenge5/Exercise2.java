package Challenge5;

public class Exercise2 {
    public static void main(String[] args) {
        int[] numArray = new int[20];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] =  i + 1;
        }
        for (int j = numArray.length; j > 0; j--) {
            System.out.println(numArray[j - 1]);
        }
    }
}
