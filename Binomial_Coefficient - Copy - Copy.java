
import java.util.Scanner;

public class Binomial_Coefficient {

    public static int binomial(int n, int r) {
        int fact = 1;
        int r_fact = 1;
        int r_n_fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        for (int i = 1; i <= r; i++) {
            r_fact = r_fact * i;
        }
        for (int i = 1; i <= (n - r); i++) {
            r_n_fact = r_n_fact * i;
        }
        int bc = fact / (r_fact * r_n_fact);
        return bc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();
        int binomialCoefficient = binomial(n, r);
        System.out.println("BC : " + binomialCoefficient);
    }
}
