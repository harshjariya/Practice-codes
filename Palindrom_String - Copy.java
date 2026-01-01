
import java.util.*;

public class Palindrom_String {

    public static boolean isPalindrom(String str) {
        boolean isPali = true;
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPali = false;
                break;
            } else {
                start++;
                end--;
            }
        }
        return isPali;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        System.out.println(isPalindrom(str));
    }
}
