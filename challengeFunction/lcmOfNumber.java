import java.util.Scanner;

public class lcmOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        int mul = 0;
        for(int i = 1 ; i <= num2; i++){
            mul = num1 * i ;
            if(mul%num2 == 0){
                break;
            }
        }
        System.out.println("LCM of a given numbers are:" + mul );
    }    
}
