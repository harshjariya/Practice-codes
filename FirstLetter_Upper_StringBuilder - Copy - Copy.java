
import java.util.Scanner;

public class FirstLetter_Upper_StringBuilder {

    public static String toUppercase(String str) {
        // StringBuilder is use for change the string 
        // String type is not used because string are immutable!
        // StringBuilder is used for change the string value!
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = "Hello i am darshan";
        System.out.println(toUppercase(str));
    }
}
