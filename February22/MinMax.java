package February22;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer value. To stop the loop, please type a non-numerical character. ");

        int min = 0;
        int max = 0;

        do{
            int valueToCompare = input.nextInt();
            if (valueToCompare > max){
                max = valueToCompare;
            }

            if (valueToCompare < min){
                min = valueToCompare;
            }
        }while (input.hasNextInt());

        System.out.printf("Minimum value is %d and Maximum value is %d",min, max);
    }
}
