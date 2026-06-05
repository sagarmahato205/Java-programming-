import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int first = 0,second = 1;
       System.out.print("0 1");
       while(first + second <= num){
        int third = first + second;
        System.out.print(third + " ");
        first = second;
        second = third;
       }
    }
}
