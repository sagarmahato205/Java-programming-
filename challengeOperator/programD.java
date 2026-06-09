package challengeOperator;

import java.util.Scanner;

public class programD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks");
        int marks = sc.nextInt();
        String grade = marks > 80 ?"High":(marks>50?"Moderate":"Low");
        System.out.println("Your grade is : "+grade);
    }
}
