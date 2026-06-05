package Bitwise;

import java.util.Scanner;

public class orOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = ~a;
        System.out.println(result);
    }
}
