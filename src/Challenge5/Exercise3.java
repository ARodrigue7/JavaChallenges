package Challenge5;

public class Exercise3 {
    public static void main(String[] args) {
        double[] doublesArr = new double[5];
        doublesArr[0] = 2.35;
        doublesArr[1] = 4.45;
        doublesArr[2] = 5.85;
        doublesArr[3] = 12.15;
        doublesArr[4] = 23.55;

        double doublesSum = 0;
        for(double e : doublesArr){
            System.out.println(e);
            doublesSum += e;
        }
        System.out.printf("\nSum: %.2f", doublesSum);
        System.out.printf("\nAverage/Mean: %.2f", doublesSum/doublesArr.length);
    }
}
