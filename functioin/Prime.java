// package functioin;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i<=n-1;i++){
            if(n%i==0){
                isPrime =false;
                break;
            }
        }
        return isPrime;
    }
    public static void PrimeinRange(int n) {
        for(int i = 2;i<= n- 1;i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(10));
        PrimeinRange(20);
       
        
    }
}
