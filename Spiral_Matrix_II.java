
import java.util.Scanner;

public class Spiral_Matrix_II{
    public static int[][] spiralMatrix(int n){
        int arr[][] = new int[n][n];
        int temp = 1;
        int sr = 0;
        int sc = 0;
        int er = arr.length-1;
        int ec = arr.length-1;

        while (sr <= er && sc <= ec) { 
            for(int i = sc; i <= ec; i++){
                arr[sr][i] = temp;
                temp++;
            }      
            sr++;

            for(int i = sr; i <= er; i++){
                arr[i][ec] = temp;
                temp++;
            }
            ec--;

            for(int i = ec; i >= sc; i--){
                arr[er][i] = temp;
                temp++;
            }
            er--;

            for(int i = er; i >= sr; i--){
                arr[i][sc] = temp;
                temp++;
            }
            sc++;
        }

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j< arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        spiralMatrix(n);
    }
}