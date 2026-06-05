package Patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //for row
        for(int i = 1; i <= n ; i++){
            //For Stars
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            //for Stars
            for(int j = 1 ; j <= 2*(n-i) ; j++){
                System.out.print(" ");
            }
             //for Stars
            for(int j =1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second half
         for(int i = n; i >= 1 ; i--){
            //For Stars
            for(int j = i ; j >= 1 ; j--){
                System.out.print("*");
            }
            //for Stars
            for(int j = 2*(n-i) ; j >= 1  ; j--){
                System.out.print(" ");
            }
             //for Stars
            for(int j =i ; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
