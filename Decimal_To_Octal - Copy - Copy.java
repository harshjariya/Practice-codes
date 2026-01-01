
import java.util.Scanner;

public class Decimal_To_Octal{
    public static int decimalToOctal(int n){
        int sum = 0;
        int temp = 0;
        // int place = 1;
        int i = 0;
        while(n != 0){
            temp = n % 8;
            // sum = sum + (temp*place);
            // place = place*10;
            sum = sum + (temp * (int) (Math.pow(10, i)));
            n = n / 8; 
            i++;
        }
        // System.out.println("sum"+sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int ans = decimalToOctal(n);
        System.out.println(ans);
    }
}