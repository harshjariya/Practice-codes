
import java.util.Scanner;

public class Print_SubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //SubArray :
        int temp = 0;
        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            temp = i;

            while(temp < size){
                sum=0;
                System.out.print("[");
                for(int j = i;j<=temp;j++){
                    System.out.print(arr[j]+" ");
                    sum = sum + arr[j];
                }
                System.out.print("Sum : "+sum);
                
                System.out.print("],");
                count++;
                temp++;

                 // MAX & MIN
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
            System.out.println();
        }
         
        System.out.println("Count of pairs : "+count);
        System.out.println("Maximum Subarray Sum : " + max);
        System.out.println("Minimum Subarray Sum : " + min);
    }
}
