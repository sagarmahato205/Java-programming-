package Loops;

import java.util.Scanner;

public class PrimeNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            System.out.println(n + " The given number is prime");
        }else{
            for(int i = 2 ; i<=n-1;i++){
               if (n%i==0) {
                 isPrime = false;
               }
            }
            if(isPrime ==true){
               System.out.println(n + " The given number is prime");
            }else{
               System.out.println(n +" The given number is not prime ");
            }
        }
        
    }
}