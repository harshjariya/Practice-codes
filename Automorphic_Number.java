
import java.util.Scanner;

public class Automorphic_Number{
    public static boolean automorphicNumber(int n){
      
        boolean isAutomorphic = false;
        int square = (int)Math.pow(n,2);
        int temp = n;
        int count = 0;
        int reminder = 0;
        int lastDigits = 0;
        while (temp != 0) { 
        reminder = n % 10;
        temp = temp / 10;
        count++;
        }
        System.out.println("Digit Count is : "+count);
        System.out.println("Square is : "+square);

        lastDigits = n % (int)Math.pow(10,count);
        if (lastDigits == n) {
            isAutomorphic = true;
        }

    return isAutomorphic;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println(automorphicNumber(n));
    }
}