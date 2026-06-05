import java.util.Scanner;

public class calc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose first number");
        int a = sc.nextInt();
        System.out.println("choose second number");
        int b = sc.nextInt();
        System.out.println("choose the operator");
        char opt = sc.next().charAt(0);
        switch (opt ) {
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break ;
            case '/' :System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            break;
            default:System.out.println("invalid operator");
        }
    }
}