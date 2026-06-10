package challengesLoop;

import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  =  5,guess;
        System.out.println("Welcome to the guessing game ");
        do{
            System.out.print("please enter the number : ");
            guess = sc.nextInt();
        }while(num != guess);
        System.out.println("Congratulations,  You guessed the right number");
    }
}