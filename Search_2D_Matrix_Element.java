
import java.util.Scanner;

public class Search_2D_Matrix_Element {

    public static boolean searchElement(int arr[][], int key) {
        // Starting for right corner : 

        // int row = 0;
        // int col = arr.length - 1;
        // while (row < arr.length && col >= 0) {
        //     if (arr[row][col] == key) {
        //         System.out.print("key found at : (" + row + "," + col + ") ");
        //         return true;
        //     } else if (arr[row][col] > key) {
        //         col--;
        //     } else {
        //         row++;
        //     }
        // }
        // System.out.print("key not found!");
        // return false;
        
        // starting from left bottom :
        int row = arr.length - 1;
        int col = 0;

        while (row >= 0 && col < arr.length) {
            if (arr[row][col] == key) {
                System.out.print("key found at : (" + row + "," + col + ") ");
                return true;
            } else if (arr[row][col] < key) {
                col++;
            } else {
                row--;
            }
        }
        System.out.print("key not found! ");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        System.out.print(searchElement(arr, key));
    }
}
