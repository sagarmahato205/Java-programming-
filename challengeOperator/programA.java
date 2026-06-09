package challengeOperator;

import java.util.Scanner;

public class programA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int greatestNumber = num1>num2 ?num1:num2;
        System.out.println(greatestNumber +": is the greatest number");
    }
}
