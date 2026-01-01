
import java.util.Scanner;

public class Binary_To_Decimal {

    public static int binaryToDecimal(int n) {
        int ans = 0;
        int lastDigit;
        int i = 0;
        int btd;
        while (n != 0) {
            lastDigit = n % 10;
            n = n / 10;
            btd = lastDigit * (int) Math.pow(2, i);
            ans = ans + btd;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int BTD = binaryToDecimal(n);
        System.out.println("Binary to Decimal is : " + n + " -> " + BTD);
    }
}
