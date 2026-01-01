import java.util.Scanner;

public class Factorial {

        public int factorial(int n) {
        int ans = 0;
        int fact = 1;
        if (n == 0 || n == 1) {
            return 1;
        }
        for(int i=n;i>=1;i--){
            // fact = fact * i;
            ans = n * factorial(n-1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n :");
        int n = sc.nextInt();
        Factorial fc = new Factorial();
        int ans = fc.factorial(n);
        System.out.println("Factorial is : " + ans);
    }
}
