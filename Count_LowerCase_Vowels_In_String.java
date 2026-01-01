
import java.util.Scanner;

public class Count_LowerCase_Vowels_In_String{
    public static int countLowerVowels(String str){
        int count = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(countLowerVowels(str));
    }
}