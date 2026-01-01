import java.util.*;
public class Check_Leap_Year{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = sc.nextInt();

        if(year % 4 == 0){
            if(!(year % 100 == 0)){
                System.out.print("Leap year");
            }
            else if(year % 400 == 0){
                System.out.print("leap year");
            }
            else{
                System.out.print("Not a leap year");
            }
        }
        else{
            System.out.print("Not a leap year");
        }

    }
}