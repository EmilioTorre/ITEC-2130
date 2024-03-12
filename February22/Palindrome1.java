package February22;
import java.util.Scanner;
public class Palindrome1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a palindrome: ");
        String value = input.nextLine();

        int low = 0;
        int high = value.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {

            if (value.charAt(low) != value.charAt(high)) {
                isPalindrome = true;
                break;
            }

            low = low + 1;
            high = high - 1;
        }
        if (isPalindrome) {
            System.out.println(value + " is a palindrome. ");
        } else {
            System.out.println(value + " is not a palindrome. ");
        }
    }

        }

