
import java.util.Scanner;

public class Bit_Manupilation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        //LEETCODE : 191
         int count = 0;
        while( n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }
}