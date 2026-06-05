import java.util.Scanner;

public class nocheck {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("number is zero");
        }else if (n>0) {
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        }
    }
}
