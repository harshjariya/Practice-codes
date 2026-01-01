
import java.util.Scanner;

public class SubStrings {

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

    public static int countSubstrings(String str) {
        String str2 = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                str2 = str2 + str.charAt(j);
                if (isPalindrom(str2)) {
                    count++;
                    System.out.print(str2 + " ");
                }
            }
            str2 = "";
        }
        return count;
    }

    // public static String longestPalindrome(String str) {
    //     String str2 = "";
    //     int count = 0;
    //     for (int i = 0; i < str.length(); i++) {
    //         for (int j = i; j < str.length(); j++) {
    //             str2 = str2 + str.charAt(j);
    //             if (isPalindrom(str2)) {
    //                 count++;
    //                 System.out.print(str2 + " ");
    //             }
    //         }
    //         str2 = "";
    //     }
    //     return count;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        System.out.println(countSubstrings(str));
    }
}
