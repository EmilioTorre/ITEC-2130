package February22;
import java.util.Scanner;
public class TemperatureWhile{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature. To stop, enter a non-numerical value. ");

        int days = 0;
        double sum = 0.0;
        double average = sum/days;

        do{
            double temperature = scanner.nextDouble();
            sum = sum + temperature;
            days++;
            average = sum / days;
        }while(scanner.hasNextDouble());
        System.out.printf("Average temperature for %d day is %.1f degrees in Fereheiht.",  days, average);
    }
}
