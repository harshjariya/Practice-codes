
import java.util.Scanner;

public class Selection_Sort {

    public static void selection(int arr[]) {
        int temp1;
        int temp2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            temp1 = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[temp1] > arr[j]) {
                    temp1 = j;
                }
            }
            temp2 = arr[temp1];
            arr[temp1] = arr[i];
            arr[i] = temp2;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selection(arr);
    }
}
