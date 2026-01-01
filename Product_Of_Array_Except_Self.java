
import java.util.Scanner;

public class Product_Of_Array_Except_Self {

    // public static void productExceptSelf(int[] nums) {
    //     int multi = 1;
    //     int arr[] = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = 0; j < nums.length; j++) {
    //             if (i == j) {
    //                 continue;
    //             } else {
    //                 multi = multi * nums[j];
    //             }
    //         }
    //         arr[i] = multi;
    //         multi = 1;
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }
    public static int[] productExceptSelf(int[] nums) {
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] * nums[i];
        }

        suffix[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i];
        }

        int res[] = new int[nums.length];

        for (int i = 1; i < nums.length - 1; i++) {
            res[i] = prefix[i - 1] * suffix[i + 1];
        }

        res[0] = suffix[1];
        res[nums.length - 1] = prefix[nums.length - 2];

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        productExceptSelf(arr);

    }
}
