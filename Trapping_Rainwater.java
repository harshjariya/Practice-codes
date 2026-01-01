
import java.util.Scanner;

public class Trapping_Rainwater {

    public static int trapWater(int arr[] , int width) {
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];

        //LeftMax
        leftMax[0] = arr[0];
        int leftWaterLevel = 0;
        for (int i = 1; i < arr.length; i++) {
            leftWaterLevel = Math.max(leftMax[i - 1], arr[i]);
            leftMax[i] = leftWaterLevel;
        }

        //RightMax
        rightMax[rightMax.length - 1] = arr[arr.length - 1];
        int rightWaterLevel = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            rightWaterLevel = Math.max(rightMax[i + 1], arr[i]);
            rightMax[i] = rightWaterLevel;
        }

        System.out.print("LeftMax : ");
        for (int i = 0; i < leftMax.length; i++) {
            System.out.print(leftMax[i] + " ");
        }
        System.out.println();
        System.out.print("RightMax : ");
        for (int i = 0; i < rightMax.length; i++) {
            System.out.print(rightMax[i] + " ");
        }
        System.out.println();


        int trappedWater = 0;
        int minLeftRight = 0;
        for(int i = 0 ; i < arr.length; i++){
            minLeftRight = Math.min(leftMax[i],rightMax[i]);
            trappedWater = trappedWater + ((minLeftRight - arr[i]) * width);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter width of each bar : ");
        int width = sc.nextInt();

        System.out.print("Total trapped water is : "+trapWater(arr,width));
    }
}
