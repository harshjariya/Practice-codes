
import java.util.Arrays;
import java.util.Scanner;

public class Intersection_Array {

    public static void intersectionArray(int num1[], int num2[]) {
        Arrays.sort(num1);
        Arrays.sort(num2);
        int temp = 0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == num2[temp]) {
                System.out.print(num2[temp] + " ");
                temp++;
            }
        }

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 size : ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2 size : ");
        int n2 = sc.nextInt();

        int num1[] = new int[n1];
        int num2[] = new int[n2];

        System.out.println("Enter num1 elements : ");
        for (int i = 0; i < n1; i++) {
            num1[i] = sc.nextInt();
        }
        System.out.println("Enter num2 elements : ");
        for (int i = 0; i < n2; i++) {
            num2[i] = sc.nextInt();
        }

        System.out.print("Intersection is : ");
        intersectionArray(num1, num2);
    }
}
