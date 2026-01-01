
import java.util.Scanner;

public class Ugly_Number{
    public static boolean  uglyNumber(int n){
        boolean isUgly = true;

        while(n!=1){
            if(n%2==0){
                n = n / 2;
            }
            else if(n%3 == 0){
                n = n / 3;
            }
            else if(n%5==0){
                 n = n / 5;
            }
            else{
                isUgly = false;
                break;
            }
        }
        return isUgly;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("Ugly Number : "+uglyNumber(n));
    }
}