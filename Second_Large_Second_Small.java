
import java.util.Scanner;

public class Second_Large_Second_Small {

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
            }
            // else{
            //     return -1;
            // }
        }

        // Approach -2 :
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > largest) {
        //         temp = largest;
        //         largest = arr[i];
        //         secondLargest = temp;
        //     } else {
        //         if (arr[i] > secondLargest && arr[i] != largest) {
        //             secondLargest = arr[i];
        //         }
        //     }
        // }
        // System.out.println("Largest : " + largest);
        System.out.println("Second Largest : " + secondLargest);
        return secondLargest;
    }

    public static int secondSmallestElement(int arr[], int size) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                temp = small;
                small = arr[i];
                secondSmall = temp;
            } else {
                if (secondSmall > arr[i] && arr[i] != small) {
                    secondSmall = arr[i];
                }
            }
        }
        System.out.println("Second Smallest : " + secondSmall);
        return secondSmall;
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
        int secondSmall = secondSmallestElement(arr, size);
        int Difference = secondLarge - secondSmall;
        System.out.print("Difference is : " + Difference);
    }
}
