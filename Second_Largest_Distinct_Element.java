
import java.util.Scanner;

public class Second_Largest_Distinct_Element {

    public static int secondLargestElement(int arr[], int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int temp = 0;

        // Approach -1 : 
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            } else if (arr[i] == largest) {
                return -1;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLarge = secondLargestElement(arr, size);
        System.out.print("secondLarge : " + secondLarge);
    }
}
