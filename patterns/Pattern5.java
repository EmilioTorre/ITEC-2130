package patterns;

public class Pattern5 {
    public static void main(String[] args) {
        for (int outerloop = 1; outerloop <= 6; outerloop++) {
            //spaces
            for (int spaces = 1; spaces <= 6 - outerloop; spaces++) {
                System.out.printf("%4s", " ");
            }
            for (int innerloop = 1; innerloop <= (outerloop); innerloop++) {
                System.out.printf("%4d", (int)Math.pow(2,innerloop));

            }
            for (int innerbackwards = 1; innerbackwards <= (outerloop) ; innerbackwards++) {
                System.out.printf(String.valueOf((int)Math.pow(2, innerbackwards)), "%4d");


            }
            System.out.println();
        }
    }
}
