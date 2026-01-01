
import java.util.Scanner;

public class Pronic_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int ans = 0;
        int k = (int)Math.sqrt(n);

        for(int i = 1;i<=k;i++){
            ans=i*(i+1);
        }
        if(ans == n){
            System.out.println(n+" is Pronic");
        }
        else{
            System.out.println(n+" is not Pronic");
        }
    }
}