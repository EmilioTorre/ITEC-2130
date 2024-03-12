package patterns;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("i is " + i );
            for (int j = 1; j < 5; j++) {
            System.out.print(" now j in the inner loop is " +j + ": ");
                 System.out.print("*     ");
            }
            System.out.println();
        }
    }
}
