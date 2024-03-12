package patterns;

public class Pattern3 {
    public static void main(String[] args) {
        for (int outerloop = 1; outerloop <= 6; outerloop++) {
            //spaces
            for (int spaces = 1; spaces <= 6 - outerloop; spaces++) {
                System.out.printf("%4s", " ");
            }
            for (int innerloop = 1; innerloop <= (outerloop); innerloop++) {
                System.out.printf("%4d", (int)Math.pow(2,innerloop));

            }
            System.out.println();
        }
    }
}
