import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your First num");
        int num1 = sc.nextInt();
        System.out.println("Please Enter your Second Number");
        int num2 = sc.nextInt();
        int gcd = gcd(num1, num2);
        System.out.println("GCD of a your given numbers are:"+ gcd);
    }
    public static int gcd(int first, int second){
        int gcd = 1;
        int least = least(first, second);
        for(int i = 2 ; i <= least ; i++ ){
            if(first%i == 0 && second % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static int least(int num1,int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
}
