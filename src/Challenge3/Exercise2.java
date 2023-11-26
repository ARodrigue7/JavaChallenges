package Challenge3;

public class Exercise2 {
    public static void main(String[] args) {
        int x = 43, y = 23;
        if (x < y){
            System.out.print("x is smaller than y and the difference between them is "+(y-x));
        }
        else if (x == y){
            System.out.print("x and y are the same");
        }
        else {
            System.out.print("x is bigger than y and the difference between them is "+(x-y));
        }
    }
}
