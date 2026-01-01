
import java.util.Scanner;

public class PowerOfDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Enter y : ");
        int y = sc.nextInt();
        int ans = 0;
        for(int i=x;i<=y;i++){
            ans =ans + x*x;
        }
        System.out.println("Answer is : "+ans);
    }
}