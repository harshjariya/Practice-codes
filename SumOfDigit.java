import java.util.*;
public class SumOfDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();    
        int sum = 0;
        int temp = 0;
        while(n>0){
            temp = n % 10;
            sum = sum + temp;
            n = n / 10;
        }
        System.out.println("Sum is : "+sum);
    }
}