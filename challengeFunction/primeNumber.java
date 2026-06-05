import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number:");
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("The given Number is Prime Number");
        }else{
            System.out.println("The given number is not prime");
        }
    }    
    public static boolean isPrime(int num){
        int i = 2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
         return true;
    }
}
