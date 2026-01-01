
import java.util.Scanner;

public class Second_Largest_Element_Array {

    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int temp = 0;

        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int secondLargest(int arr[], int size) {
        // Approach - 3 : 

        reverse(arr);
        int secondLarge = arr[1];
        return secondLarge;
    }

    public static void secondLargestElement(int arr[], int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int temp = 0;

        // Approach -1 : 
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] > largest) {
        //         secondLargest = largest;
        //         largest = arr[i];
        //     } else if (arr[i] > secondLargest && arr[i] != largest) {
        //         secondLargest = arr[i];
        //     }
        // }
        // Approach -2 :
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                temp = largest;
                largest = arr[i];
                secondLargest = temp;
            } else {
                if (arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }

        System.out.println("Largest : " + largest);
        System.out.println("Second Largest : " + secondLargest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // int secondLarge = secondLargest(arr, size);

        secondLargestElement(arr, size);
        // System.out.println("secondLarge : " + secondLarge);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
