package patterns;

public class Pattern2 {
    public static void main(String[] args) {
        for (int outloop = 1; outloop <= 5; outloop++) {
            for (int innerloop = 1; innerloop <= (6 - outloop); innerloop++) {
                System.out.printf("%4d", innerloop);
            }
            System.out.println();
        }
    }
}
