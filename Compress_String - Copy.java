
import java.util.Scanner;

public class Compress_String {

    // String : O(N)
    // public static String compress(String str) {
    //     String newStr = "";
    //     for (int i = 0; i < str.length(); i++) {
    //         Integer count = 1;
    //         while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
    //             count++;
    //             i++;
    //         }
    //         newStr += str.charAt(i);
    //         if (count > 1) {
    //             newStr += count.toString();
    //         }
    //     }
    //     return newStr;
    // }
    //StringBuilder : Good comapre to String O(N)
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compress(str));
    }
}
