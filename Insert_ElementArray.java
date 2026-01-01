
import java.util.Scanner;

public class Insert_ElementArray {

    public static void insertElement(int arr[], int element, int pos) {

        // here question said position not index !!!
        if (pos < 1 || pos > arr.length) {
            System.out.println("Invalid position!");
            return;
        }

        for (int i = arr.length - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = element;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter position where you want to add element: ");
        int pos = sc.nextInt();
        System.out.print("Enter element you want to add : ");
        int element = sc.nextInt();
        insertElement(arr, element, pos);
    }
}
