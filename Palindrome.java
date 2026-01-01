
import java.util.Scanner;

public class Palindrome{
    public static int pelindrom(int n){
        int ld = 0;
        int reverse = 0;
        while(n != 0){
            ld = n % 10;
            reverse = ld + (reverse*10);
            n = n / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        if(pelindrom(n) == n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}