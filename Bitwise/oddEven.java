package Bitwise;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num & 1) == 1){
            System.out.println("Given number is odd");
        }else{
            System.out.println("The Given number is even");
        }
    }
}
