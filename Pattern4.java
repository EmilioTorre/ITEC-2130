package patterns;

public class Pattern4 {
    public static void main(String[] args) {
        for (int outerloop = 1; outerloop <=6 ; outerloop++) {

            for (int spaceloop = outerloop; spaceloop > 1; spaceloop--) {
                System.out.print("  ");
            }

            for (int numberloop = 1; numberloop <= 7 - outerloop; numberloop++) {
                System.out.print(numberloop + " ");
            }

            System.out.print("\n"); // same as System.out.println("")

        }
    }
}
