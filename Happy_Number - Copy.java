
import java.util.Scanner;

public class Happy_Number{
    public static boolean isHappyNumber(int n){
        if(n == 1 || n == 7){
            return true;
        }
        if(n < 10){
            return false;
        }
        int temp = 0;
        int sum = 0;
        while(n != 0){
            temp = n % 10;
            sum = sum + (int)Math.pow(temp,2);
            n = n / 10;
        }
            return isHappyNumber(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Happy number : "+ n +" "+ isHappyNumber(n));
    }
}