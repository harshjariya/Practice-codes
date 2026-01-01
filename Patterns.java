
import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        //Pattern-1 -> 1010
        // for(int i = n ; i > 0; i--){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Pattern-2
        // for(int i=1;i<=n;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        //Pattern-3
        // char ch = 'A';
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        //Pattern-4
        // System.out.print("Enter m : ");
        // int m = sc.nextInt();
        // for(int i = 0;i<=n;i++){
        //     for(int j=0;j<=m;j++){
        //         if(i == 0 || j == 0 || i == n || j == m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // //Pattern-5
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //Pattern-6
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // Pattern-7
        // int temp = 0;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         temp++;
        //         System.out.print(temp + " ");
        //     }
        //     System.out.println();
        // }
        //Pattern-8
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j) % 2 == 0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }
        //Pattern-9
        // int temp = 1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("_");
        //     }
        //     for(int k=1;k<=temp;k++){
        //         System.out.print("*");
        //     }
        //     temp = temp + 2;
        //      for(int j=1;j<=n-i;j++){
        //         System.out.print("_");
        //     }
        //     System.out.println();
        // }
        //Pattern-10
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //Pattern-11
        // for(int i=1;i<=n;i++){
        //     for(int k = 1; k<= i - 1; k++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<= n-i+1 ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Pattern - 12
        // for(int i = 1; i<=n;i++){
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // Pattern - 13
        // for(int i = 1;i<=n;i++){
        //     for(int j = 1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        //Pattern - 14
        // for(int i=1;i<=n;i++){
        //     int temp = n-i+1;
        //     for(int j = temp; j >= 1;j--){
        //         System.out.print(temp);
        //         temp--;
        //     }
        //     System.out.println();
        // }
        //Pattern -15
        // for (int i = 1; i <= n; i++) {
        //     for (int j = n - i + 1; j <= 2 * (n - i) + 1; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        //Pattern - 16
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=2*(n-i)+1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }  
        // Pattern - 17 - Baki che aa.. (Butterfly)
        // for(int i=1;i<=n;i++){
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print("*");
        //     }
        //     for(int k = 1; k<=((2*n)-(2*i));k++){
        //     System.out.print("_");
        // }
        //     System.out.println();
        // }   
        //  for(int i=1;i<=n;i++){
        //     for(int j = n ; j >= i ; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }      
        // Pattern - 18
        // for(int i = 1; i<=n;i++){
        //     int current = i;
        //     for(int j = 1 ; j<=i;j++){
        //         System.out.print(current + " ");
        //         current = current + (n - j);
        //     }
        //     System.out.println();
        // }
        //Pattern - 19
        // for(int i = 1; i <= n ; i++){
        //     for(int j = 1; j <= n; j++){
        //         if(i == 1 || i == n || i == j || (i+j == n+1)){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // Pattern - 20
        // int temp = 1;
        // for(int i = 1; i<=n;i++){
        //     for(int j = 1 ; j <= (2*i)-1 ; j++){
        //         if (i == j) {
        //             System.out.print(temp);
        //             temp++;
        //         }
        //         else if(j == 1){
        //             System.out.print("1");
        //         }
        //         else if (j == (2*i)-1) {
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }
        // Pattern - 21  swastika pattern
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i <= (((int) n / 2) + 1) && j == 1) {
        //             System.out.print("*");
        //         } else if (j <= (((int) n / 2) + 1) && i == n) {
        //             System.out.print("*");
        //         } else if (i >= (((int) n / 2) + 1) && j == n) {
        //             System.out.print("*");
        //         } else if (j >= (((int) n / 2) + 1) && i == 1) {
        //             System.out.print("*");
        //         } else if (i == (((int) n / 2) + 1)) {
        //             System.out.print("*");
        //         } else if (j == (((int) n / 2) + 1)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // Pattern - 22 - Baki che .. PDF - 12
        // for(int i = 0 ; i< n ; i++){
        //     for(int j = 0 ; j < (2*i)+1 ; j++){
        //         if(j == 0){
        //             System.out.print("1");
        //         }
        //         else if (j % 2 != 0) {
        //             System.out.print("*");
        //         }
        //         else if(j % 2 == 0){
        //             System.out.print((2*i)-1);
        //         }
        //     }
        //     System.out.println();
        // }
        // Pattern - 23
        
        // for(int i = 1 ; i <= n ; i++){
        //     for(int j = 1 ; j <= n-i ; j++){
        //         System.out.print("_");
        //     }
        //     for(int k = i ; k >= 1 ; k--){
        //         System.out.print(k);
        //     }
        //     for(int l = 2 ; l <= i ; l++){
        //         System.out.print(l);
        //     }
        //     System.out.println();
        // }
        // for(int i = 1 ; i <= n ; i++){
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print("_");
        //     }
        //     for(int k = n - i ; k >=1 ; k--){
        //         System.out.print(k);
        //     }
        //     for(int l = 2 ; l <= n-i ; l++){
        //         System.out.print(l);
        //     }
        //     System.out.println();
        // }

        // Pattern - 24 Pascal Triangle
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print("_");
        //     }
        //     int num = 1;
        //     for (int k = 0; k <= i; k++) {
        //         System.out.print(num + " ");
        //         num = num * (i - k) / (k + 1);
        //     }
        //     System.out.println();
        // }

        // Pattern - 25 PDF-12

        int temp = 0;
        for(int i = 1; i <= n; i++){
            temp = 1;
            for(int j = 1; j <= (2*i)-1; j++){
                if(j < i){
                    if(j % 2 == 0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(temp);
                        
                    }
                    temp++;
                }
                else{
                   if(j % 2 != 0){
                        System.out.print(temp);
                    }
                     else{
                        System.out.print("*");
                    }
                    temp--;
                }
            }
            System.out.println();
        }

    }
}
