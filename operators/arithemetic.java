import java.util.Scanner;

public class arithemetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("sum is : "+sum);
        int sub = a-b;
        System.out.println("subtract is: "+sub);
        int mul = a*b;
        System.out.println("multiplication is :"+mul);
        int div = a/b;
        System.out.println("division is : "+ div);
        int rem = a%b;
        System.out.println("remainder is : "+rem ); 

    }
}
