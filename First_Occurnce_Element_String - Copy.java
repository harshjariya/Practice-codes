
import java.util.Scanner;

public class First_Occurnce_Element_String {

    public static char firstOccurnce(String str) {
        char[] ch = new char[26];
        for (int i = 0; i < str.length(); i++) {
            ch[str.charAt(i) - 'a']++;
            if (ch[str.charAt(i) - 'a'] > 1) {
                return str.charAt(i);
            }
        }
        return '*';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();
        System.out.print(firstOccurnce(str));
    }
}
