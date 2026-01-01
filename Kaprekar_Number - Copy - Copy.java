


import java.util.Scanner;

public class Kaprekar_Number {

    public static boolean kaprekarNumber(int n) {
        boolean isKaprekar = false;

        int square = (int) Math.pow(n, 2);
        int digit = 0;
        int count = 0;
        while (square != 0) {
            digit = square % 10;
            count++;
            square = square / 10;
        }
        System.out.println("Total digits : " + count);
        int divide = (int) count / 2;
        int lastDigits = 0;
        while (square != 0) {
            lastDigits = lastDigits + square % (divide * 10);
            square = square / (divide * 10);
        }
        if (lastDigits == square) {
            isKaprekar = true;
        }
        return isKaprekar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Kaprekar Number is : " + n + " " + kaprekarNumber(n));
    }
}
