
import java.util.Scanner;

public class Reverse_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int lastDigit = 0;
        while (n != 0) {
            lastDigit = (lastDigit * 10) + n % 10;
            n = n / 10;
        }
        System.out.println("Reverse number is : " + lastDigit);
    }
}
