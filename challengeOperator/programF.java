package challengeOperator;

import java.util.Scanner;

public class programF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first Number");
        int num1 = sc.nextInt();
        System.out.println("enter your second number");
        int num2 = sc.nextInt();
        System.out.println("Enter operator");
        String operator = sc.next();
        switch (operator) {
            case "+":System.out.println(num1+num2);
                break;
            case "-":System.out.println(num1-num2);
                break;
            case "*":System.out.println(num1*num2);
                break;
            case "/":System.out.println(num1/num2);
                break;
        
            default:System.out.println("Enter valid operator");
                break;
        }
    }
}
