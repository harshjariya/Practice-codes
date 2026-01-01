
import java.util.Scanner;

public class Range_In_Prime{
    public static boolean  isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void rangeInPrime(int n){
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        rangeInPrime(n);

    }
}