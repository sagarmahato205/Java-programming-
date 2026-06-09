package challengeOperator;

import java.util.Scanner;

public class programB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 

        String OddOREven = num%2 == 0 ? "Even" : "Odd";
        System.out.println("The given Number is  : " + OddOREven);
    }
}
