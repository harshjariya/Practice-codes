
import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        //Pattern2
        // for(int i=0;i<n;i++){
        //     for(int j=n;j>i;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Pattern3
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        //Patter4
        // char ch = 'A';
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        //Patter5
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 0; k <= i; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //pattern6
        // System.out.print("Enter m : ");
        // int m = sc.nextInt();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(i==0 || j==0 || i==(n-1) || j==(m-1)){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //pattern7
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //pattern8
        // int count = 0;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         count++;
        //         System.out.print(count + " ");
        //     }
        //     System.out.println("");
        // }

        //pattern9
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         if(((i+j) % 2) == 0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }
          

        // 
        
   

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if ( i == n/2 + 1 ||
                     j == n/2 + 1 ||
                    (i <= n/2 && j == 1) ||
                    (i > n/2 && j == n) ||
                    (i == 1 && j > n/2) ||
                    (i == n && j <= n/2 + 1) )

                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    


    }
}
