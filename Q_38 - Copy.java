
import java.util.Scanner;

public class Q_38 {

    public static int ascendingatleast3(int arr1[]) {
        int temp = arr1[0];
        int count = 1;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] == temp) {
                count++;
            } else if (count >= 3 && arr1[i] != temp) {
                temp = arr1[i];
                count = 1;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Answer : " + ascendingatleast3(arr));
    }
}
