
import java.util.Scanner;

public class Anagram_Strings {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // Approach - 1 : 
        // int freq[] = new int[26];
        // int indexS= 0;
        // int indexT= 0;

        // while(indexS < s.length() && indexT < t.length()){
        //     char charS = s.charAt(indexS);
        //     int freqIndexS = charS - 97;
        //     freq[freqIndexS] += 1;
        //     char charT = t.charAt(indexT);
        //     int freqIndexT = charT - 97;
        //     freq[freqIndexT] -= 1;
        //     indexS++;
        //     indexT++;
        // }

        //Approach - 2:
        char charCount[] = new char[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            charCount[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string1 : ");
        String str1 = sc.next();
        System.out.print("Enter a string2 : ");
        String str2 = sc.next();
        System.out.println(isAnagram(str1,str2));

    }
}
