
import java.util.Scanner;

public class Count_Primes_1_to_N{
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 2; i<= n ; i++){
            if( n%i == 0 ){
                count++;
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }

    public static int Range_In_Prime(int n){
        int totalCount = 0;
        for(int i = 2 ; i <= n ; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                totalCount++;
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.err.println("totalCount : "+Range_In_Prime(n));
    }
}