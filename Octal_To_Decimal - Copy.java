import java.util.*;
public class Octal_To_Decimal{
    public static int octalToDecimal(int n){
        int ans = 0;
        int lastDigit;
        int i = 0;
        int otd;
        while (n != 0) {
            lastDigit = n % 10;
            n = n / 10;
            otd = lastDigit * (int) Math.pow(8, i);
            ans = ans + otd;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int newans = octalToDecimal(n);
        System.out.println("Octal to Decimal : "+newans);
}
}