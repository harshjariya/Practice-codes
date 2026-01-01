
import java.util.Scanner;

public class Reverse_Number_Recursion{  
    public int reverse(int n,int lastDigit,int ans){
        if(n == 0){
            return 0;
        }
        while(n != 0){
            lastDigit = n % 10;
            reverse(n/10,lastDigit,ans);
            ans = (ans * 10) + lastDigit;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        Reverse_Number_Recursion RC = new Reverse_Number_Recursion();
        int ans = RC.reverse(n, 0,0);
        System.out.println("Reverse is : "+ans);
    }
}