
import java.util.Scanner;

public class Right_K_Shift_Element_Array {

    public static void reverseArray(int arr[], int i, int j) {

        int temp = 0;
        while (i <= j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // for (int start = 0; start < arr.length; start++) {
        //     System.out.print(arr[start] + " ");
        // }
    }

    public static void kShift(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter k : ");
        int k = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        kShift(arr, k);
        // reverseArray(arr);
    }
}
