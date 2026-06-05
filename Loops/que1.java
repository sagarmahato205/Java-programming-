package Loops;

import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int choice = sc.nextInt();
        int evensum =0;
        int oddSum = 0;
        do{
            if(n%2==0){
                evensum += n;
            }else{
                oddSum += n;
            }
            System.out.println("Do you want to continue , press 1 for yes or 0 for no ");
        }while(choice == 1);
        System.out.println("Sum of even number"+n);
        System.out.println("Sum of odd number"+n);
        
       
    }
}
