
import java.util.Scanner;

public class Bubble_Sort{
    public static void bubble(int arr[]){
        int temp = 0;
        for(int i = 0 ; i < arr.length-1; i++){
            for(int j = 0 ; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }   
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        bubble(arr);
        }
}