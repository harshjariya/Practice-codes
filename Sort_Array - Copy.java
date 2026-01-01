
import java.util.Scanner;

public class Sort_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int temp = 0;
        for(int i=0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}