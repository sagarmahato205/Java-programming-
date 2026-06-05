package Patterns;

import java.util.Scanner;

public class halfTriangle {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      //For Row
      for(int i = 1 ; i <= n ; i++ ){
        //For Space
        for(int j = 1 ; j <= n-i ; j++ ){
            System.out.print(" ");
        }
        // for Stars
         for(int j = 1 ; j <= i ; j++){
            System.out.print("*");
         }
         System.out.println();
      }
    }
}
