
import java.util.Scanner;

public class SubString{
    public static String subString(String str , int st , int end){
        String str2 = "";

        for(int i = st ; i < end;i++){
            str2 += str.charAt(i);
        }
        return str2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        System.out.print(subString(str, 0, 5));
    }
}