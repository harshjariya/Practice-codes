
import java.util.Scanner;

public class Decimal_To_Binary {

    public static int decimalToBinary(int n) {
        int reminder;
        int ans = 0;
        int i = 0;
        while (n != 0) {
            reminder = n % 2;
            ans = ans + (reminder * (int) (Math.pow(10, i)));
            n = n / 2;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int DTB = decimalToBinary(n);
        System.out.println("Decimal to Binary is : " + n + " -> " + DTB);
    }
}
