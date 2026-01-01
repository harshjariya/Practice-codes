
import java.util.Scanner;

public class Snake_2D_Array{
    public static void snake2D(int snake[][]){
        int temp = 1;

        for(int i = 0 ; i < snake.length ; i++){
            if (i % 2 == 0) {
                 for(int j = 0 ; j < snake.length; j++){
                    snake[i][j]=temp;
                    temp++;
                }
            }
            else{
                for(int j = snake.length-1; j >= 0 ; j--){
                    snake[i][j]=temp;
                    temp++;
                }
            }
           
        }
        for(int i = 0 ; i < snake.length; i++){
            for(int j = 0 ; j < snake.length; j++){
                System.out.print(snake[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int snake[][] = new int[n][n];

    snake2D(snake);
    }
}