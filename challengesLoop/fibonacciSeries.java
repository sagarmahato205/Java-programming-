package challengesLoop;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to printing fibonacci  series");
        System.out.println("Enter the number of element to be printed");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++){
           System.out.println(fibonnaci(i) + " ");
        }
    }
    public static int fibonnaci(int postion){
        if(postion == 1){
            return 0;
        }
        if(postion == 2){
            return 1;
        }
        return fibonnaci(postion - 1)+fibonnaci(postion - 2);
    }
}
