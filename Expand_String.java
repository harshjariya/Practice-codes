
import java.util.Scanner;

public class Expand_String {

    public static String expandString(String str) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            while (Character.isDigit(str.charAt(i))) {
                count = count * 10 + str.charAt(i) - '0';
                i++;

                for (int j = 0; j < count; j++) {
                    if (!Character.isDigit(str.charAt(i))) {
                        System.out.print(str.charAt(i));
                        temp++;
                    }
                }

            }
            count = 0;
            // System.out.println(" "+temp);
            // if(!Character.isDigit(str.charAt(i))){
            //     System.out.print(str.charAt(i));
            // }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "2a3bc4dE5F2G7H";
        System.out.print("Enter a string : ");
        String str = sc.next();
        expandString(str);
    }
}
