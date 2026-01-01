
import java.util.Scanner;

public class Remove_Duplicate {

    public static int removeDuplicate(int arr[]) {
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = removeDuplicate(arr);
        System.out.println("Ans : "+ans);
    }
}
