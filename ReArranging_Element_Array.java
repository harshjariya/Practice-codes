
import java.util.Scanner;

public class ReArranging_Element_Array {

    public static void rearrangeElement(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        int temp;
        while (i <= j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;  
            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrangeElement(arr);

    }
}
