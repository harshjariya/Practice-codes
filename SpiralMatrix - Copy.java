
import java.util.Scanner;

public class SpiralMatrix {

    public static void spiralMatrix(int arr[][], int n) {

        int sr = 0;
        int sc = 0;
        int er = arr.length - 1;
        int ec = arr.length - 1;

        while (sr <= er && sc <= ec) {
            for (int i = sc; i <= ec; i++) {
                System.out.print(arr[sr][i] + " ");
            }
            sr++;

            for (int i = sr; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }
            ec--;

            for (int i = ec; i >= sc; i--) {
                System.out.print(arr[er][i] + " ");
            }
            er--;

            for (int i = er; i >= sr; i--) {
                System.out.print(arr[i][sc] + " ");
            }
            sc++;
        }

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        spiralMatrix(arr, n);
    }
}
