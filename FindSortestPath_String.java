
import java.util.Scanner;

public class FindSortestPath_String{
    public static float isSortest(String str){
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
            else if(str.charAt(i) == 'W'){
                x--;
            }
            else{
                System.out.println("Invalid string !!");
                return -1;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        System.out.println(isSortest(str));
    }
}