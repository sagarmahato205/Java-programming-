import java.util.Scanner;
public class java{
    public static void main(String[] args) {
    //    int a=1;
    //    int b=3;
    //    if (a>b) {
    //     System.out.println(a+ "greater than " + b);
    //    }else{
    //     System.out.println(b + "is greater than "+ a);
    //    }
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n%2==0) {
        System.out.println(n +"is even");
    }else{
        System.out.println(n +"is odd" );
    }
    }
}