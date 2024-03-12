package February15;

public class DayStringLoop {
    public static void main(String[] args){
        String day = "Friday";

        for(int i = day.length() - 1; i >= 0; i--){
            System.out.println(day.charAt(i));
        }
        System.out.println();
        for(int j = 0; j < day.length() - 1; j++){
            System.out.println(day.charAt(j));
        }
        System.out.println();

        int sum = 0;
        for(int i = 3; i <= 100; i++){
            sum = sum +i;
        }
    }
}
