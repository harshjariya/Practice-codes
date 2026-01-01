
import java.util.Scanner;

public class Sum_Of_Series{
    public static void seriesOfSum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum = sum + j;
            }
        }
                System.out.print(sum+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        Sum_Of_Series ss = new Sum_Of_Series();
        ss.seriesOfSum(n);
    }
}