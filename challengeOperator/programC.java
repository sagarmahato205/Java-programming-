import java.util.Scanner;

public class programC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter absolute Number : ");
        int num1 = sc.nextInt();

        int result = num1 >= 0 ? num1 : -num1;
        System.out.println("the Absolute value is :" + result);
       
    }
}