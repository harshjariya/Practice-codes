
import java.util.Scanner;

public class Pairs_Of_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                System.out.print("("+arr[i] +" "+ arr[j] +")");
            }
            System.out.println();
        }
    }
}