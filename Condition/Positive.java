import java.util.Scanner;

public class Positive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0 ){
            System.out.println(num + " is zero");
        }else if(num > 0 ){
            System.out.println("number is Positive");
        }else{
            System.out.println("number is negative");
        }
    }
}